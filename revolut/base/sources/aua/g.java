package aua;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends we0.g {
    public g() {
        super(1, 2, 0);
    }

    public static void d(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, je0.d dVar, String str) {
        if (sharedPreferences.contains(str) && (sharedPreferences.getAll().get(str) instanceof Integer)) {
            int i = sharedPreferences.getInt(str, 0);
            editor.remove(str);
            editor.putString(str, (String) dVar.c(Integer.valueOf(i), Integer.TYPE));
        }
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPref, je0.d mapper) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        SharedPreferences.Editor editorEdit = sharedPref.edit();
        Intrinsics.h(editorEdit);
        d(sharedPref, editorEdit, mapper, "SUCCESS_SCREEN_COUNTER");
        d(sharedPref, editorEdit, mapper, "POSTPONE_RATE_COUNTER");
        if (sharedPref.contains("NEXT_POSSIBLE_RATE_ACTION_DATE") && (sharedPref.getAll().get("NEXT_POSSIBLE_RATE_ACTION_DATE") instanceof Long)) {
            long j2 = sharedPref.getLong("NEXT_POSSIBLE_RATE_ACTION_DATE", 0L);
            editorEdit.remove("NEXT_POSSIBLE_RATE_ACTION_DATE");
            editorEdit.putString("NEXT_POSSIBLE_RATE_ACTION_DATE", (String) mapper.c(Long.valueOf(j2), Long.TYPE));
        }
        editorEdit.commit();
    }
}
