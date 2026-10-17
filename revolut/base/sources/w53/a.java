package w53;

import android.content.Intent;
import android.nfc.Tag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f294688a = new a();

    private a() {
    }

    public static Tag a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
    }
}
