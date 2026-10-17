package av1;

import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9872b;

    public /* synthetic */ c(String str, int i) {
        this.f9871a = i;
        this.f9872b = str;
    }

    public String a() {
        switch (this.f9871a) {
            case 2:
                String[] elements = {"BILLS_AND_TAXES", this.f9872b};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return d0.k0(kotlin.collections.d.L(elements), ".", null, null, 0, null, 62);
            default:
                String[] elements2 = {"DONATIONS", this.f9872b};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return d0.k0(kotlin.collections.d.L(elements2), ".", null, null, 0, null, 62);
        }
    }

    public String b() {
        return this.f9872b;
    }

    public String c() {
        return this.f9872b;
    }

    public String d() {
        return this.f9872b;
    }
}
