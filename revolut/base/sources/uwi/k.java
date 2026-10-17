package uwi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f283675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f283676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f283677c;
    public final Data d;

    public k() {
        this(0);
    }

    public static k a(k kVar, Data airport, Data lounges, Data savedLounges, Data userHasExistingPass, int i) {
        if ((i & 1) != 0) {
            airport = kVar.f283675a;
        }
        if ((i & 2) != 0) {
            lounges = kVar.f283676b;
        }
        if ((i & 4) != 0) {
            savedLounges = kVar.f283677c;
        }
        if ((i & 8) != 0) {
            userHasExistingPass = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(airport, "airport");
        Intrinsics.checkNotNullParameter(lounges, "lounges");
        Intrinsics.checkNotNullParameter(savedLounges, "savedLounges");
        Intrinsics.checkNotNullParameter(userHasExistingPass, "userHasExistingPass");
        return new k(airport, lounges, savedLounges, userHasExistingPass);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f283675a, kVar.f283675a) && Intrinsics.f(this.f283676b, kVar.f283676b) && Intrinsics.f(this.f283677c, kVar.f283677c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f283677c, kii.e.c(this.f283676b, this.f283675a.hashCode() * 31, 31), 31);
    }

    public k(Data airport, Data lounges, Data savedLounges, Data userHasExistingPass) {
        Intrinsics.checkNotNullParameter(airport, "airport");
        Intrinsics.checkNotNullParameter(lounges, "lounges");
        Intrinsics.checkNotNullParameter(savedLounges, "savedLounges");
        Intrinsics.checkNotNullParameter(userHasExistingPass, "userHasExistingPass");
        this.f283675a = airport;
        this.f283676b = lounges;
        this.f283677c = savedLounges;
        this.d = userHasExistingPass;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
