package t44;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f267880c;
    public final Data d;
    public final n e;

    public f(String title, String str, String buttonTitle, Data addresses, n selectionState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Intrinsics.checkNotNullParameter(selectionState, "selectionState");
        this.f267878a = title;
        this.f267879b = str;
        this.f267880c = buttonTitle;
        this.d = addresses;
        this.e = selectionState;
    }

    public static f a(f fVar, Data data, n nVar, int i) {
        String title = fVar.f267878a;
        String str = fVar.f267879b;
        String buttonTitle = fVar.f267880c;
        if ((i & 8) != 0) {
            data = fVar.d;
        }
        Data addresses = data;
        if ((i & 16) != 0) {
            nVar = fVar.e;
        }
        n selectionState = nVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Intrinsics.checkNotNullParameter(selectionState, "selectionState");
        return new f(title, str, buttonTitle, addresses, selectionState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f267878a, fVar.f267878a) && Intrinsics.f(this.f267879b, fVar.f267879b) && Intrinsics.f(this.f267880c, fVar.f267880c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f267878a.hashCode() * 31;
        String str = this.f267879b;
        return this.e.hashCode() + kii.e.c(this.d, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f267880c), 31);
    }
}
