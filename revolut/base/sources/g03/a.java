package g03;

import com.revolut.data.model.Data;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f139253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f139254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f139255c;
    public final Data d;
    public final Data e;

    public a(Data settingsItems, f0 disposableCard, Data disposableCardDesign, Data legalContext, Data user) {
        Intrinsics.checkNotNullParameter(settingsItems, "settingsItems");
        Intrinsics.checkNotNullParameter(disposableCard, "disposableCard");
        Intrinsics.checkNotNullParameter(disposableCardDesign, "disposableCardDesign");
        Intrinsics.checkNotNullParameter(legalContext, "legalContext");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f139253a = settingsItems;
        this.f139254b = disposableCard;
        this.f139255c = disposableCardDesign;
        this.d = legalContext;
        this.e = user;
    }

    public static a a(a aVar, Data data, f0 f0Var, Data data2, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = aVar.f139253a;
        }
        Data settingsItems = data;
        if ((i & 2) != 0) {
            f0Var = aVar.f139254b;
        }
        f0 disposableCard = f0Var;
        if ((i & 4) != 0) {
            data2 = aVar.f139255c;
        }
        Data disposableCardDesign = data2;
        if ((i & 8) != 0) {
            data3 = aVar.d;
        }
        Data legalContext = data3;
        if ((i & 16) != 0) {
            data4 = aVar.e;
        }
        Data user = data4;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(settingsItems, "settingsItems");
        Intrinsics.checkNotNullParameter(disposableCard, "disposableCard");
        Intrinsics.checkNotNullParameter(disposableCardDesign, "disposableCardDesign");
        Intrinsics.checkNotNullParameter(legalContext, "legalContext");
        Intrinsics.checkNotNullParameter(user, "user");
        return new a(settingsItems, disposableCard, disposableCardDesign, legalContext, user);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f139253a, aVar.f139253a) && Intrinsics.f(this.f139254b, aVar.f139254b) && Intrinsics.f(this.f139255c, aVar.f139255c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f139255c, (this.f139254b.hashCode() + (this.f139253a.hashCode() * 31)) * 31, 31), 31);
    }
}
