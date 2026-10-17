package ie6;

import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtensionAuthRequestData f160629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f160630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f160631c;
    public final boolean d;

    public a() {
        this(0);
    }

    public static a a(a aVar, ExtensionAuthRequestData extensionAuthRequestData, i verificationState, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            extensionAuthRequestData = aVar.f160629a;
        }
        if ((i & 2) != 0) {
            verificationState = aVar.f160630b;
        }
        if ((i & 4) != 0) {
            z = aVar.f160631c;
        }
        if ((i & 8) != 0) {
            z3 = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(verificationState, "verificationState");
        return new a(extensionAuthRequestData, verificationState, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f160629a, aVar.f160629a) && this.f160630b == aVar.f160630b && this.f160631c == aVar.f160631c && this.d == aVar.d;
    }

    public final int hashCode() {
        ExtensionAuthRequestData extensionAuthRequestData = this.f160629a;
        return Boolean.hashCode(this.d) + j6.a.c((this.f160630b.hashCode() + ((extensionAuthRequestData == null ? 0 : extensionAuthRequestData.hashCode()) * 31)) * 31, 31, this.f160631c);
    }

    public a(ExtensionAuthRequestData extensionAuthRequestData, i verificationState, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(verificationState, "verificationState");
        this.f160629a = extensionAuthRequestData;
        this.f160630b = verificationState;
        this.f160631c = z;
        this.d = z3;
    }

    public /* synthetic */ a(int i) {
        this(null, i.IDLE, false, false);
    }
}
