package pqg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.vaults.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f238766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f238767c;
    public final Image d;
    public final TextLocalisedClause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f238768g;

    public t(List items, boolean z, TextLocalisedClause accountBalance, Image image, TextLocalisedClause submitCtaTitle, boolean z3) {
        TextLocalisedClause title = v04.b.Q(new TextLocalisedClause(R$string.vaults_funding_options_add_money, null, null, 14), com.revolut.feature.retail.savings.api.R$string.savings_onboarding_add_money_amount);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(accountBalance, "accountBalance");
        Intrinsics.checkNotNullParameter(submitCtaTitle, "submitCtaTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f238765a = items;
        this.f238766b = z;
        this.f238767c = accountBalance;
        this.d = image;
        this.e = submitCtaTitle;
        this.f = z3;
        this.f238768g = title;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        boolean z;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        t tVar = (t) oldState;
        boolean z6 = tVar.f238766b != this.f238766b;
        boolean z11 = !Intrinsics.f(tVar.f238767c, this.f238767c);
        boolean z12 = !Intrinsics.f(tVar.d, this.d);
        boolean z29 = !Intrinsics.f(tVar.e, this.e);
        if (tVar.f != this.f) {
            z4 = true;
            z = z12;
            z3 = z29;
        } else {
            z = z12;
            z3 = z29;
            z4 = false;
        }
        return new s(z6, z11, z, z3, z4);
    }

    @Override // jki.n
    public final List c() {
        return this.f238765a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f238765a, tVar.f238765a) && this.f238766b == tVar.f238766b && Intrinsics.f(this.f238767c, tVar.f238767c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && this.f == tVar.f && Intrinsics.f(this.f238768g, tVar.f238768g);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.c(this.f238765a.hashCode() * 31, 31, this.f238766b), 31, this.f238767c);
        Image image = this.d;
        return this.f238768g.hashCode() + j6.a.c(t61.a.a((iA + (image == null ? 0 : image.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
