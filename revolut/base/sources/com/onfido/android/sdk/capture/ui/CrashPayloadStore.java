package com.onfido.android.sdk.capture.ui;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/CrashPayloadStore;", "", "()V", "PREFS_NAME", "", "clear", "", "context", "Landroid/content/Context;", "key", "load", "", "save", "payload", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashPayloadStore {

    @NotNull
    private static final String PREFS_NAME = "onfido_crash_payload";

    @NotNull
    public static final CrashPayloadStore INSTANCE = new CrashPayloadStore();

    private CrashPayloadStore() {
    }

    public final void clear(@NotNull Context context, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = context.getSharedPreferences("onfido_crash_payload", 0);
        Intrinsics.h(sharedPreferences);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        Set<String> setKeySet = sharedPreferences.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeySet) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (a0.H(str, key + '_', false)) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            editor.remove((String) it8.next());
        }
        editor.apply();
    }

    @NotNull
    public final Map<String, String> load(@NotNull Context context, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, ?> all2 = context.getSharedPreferences("onfido_crash_payload", 0).getAll();
        Intrinsics.checkNotNullExpressionValue(all2, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all2.entrySet()) {
            String key2 = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key2, "<get-key>(...)");
            if (a0.H(key2, key + '_', false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key3 = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key3, "<get-key>(...)");
            linkedHashMap2.put(d0.e0((String) key3, key + '_'), entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key4 = entry3.getKey();
            Object value = entry3.getValue();
            linkedHashMap3.put(key4, value instanceof String ? (String) value : null);
        }
        return linkedHashMap3;
    }

    @NotNull
    public final String save(@NotNull Context context, @NotNull Map<String, String> payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        SharedPreferences sharedPreferences = context.getSharedPreferences("onfido_crash_payload", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        for (Map.Entry<String, String> entry : payload.entrySet()) {
            String key = entry.getKey();
            editor.putString(string + '_' + key, entry.getValue());
        }
        editor.apply();
        return string;
    }
}
