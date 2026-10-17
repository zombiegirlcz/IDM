package lej;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f194559a;

    public static final class a {
        private a() {
        }
    }

    static {
        Uri uri2 = Uri.parse("content://telephony/carriers/preferapn/subId");
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        f194559a = uri2;
    }
}
