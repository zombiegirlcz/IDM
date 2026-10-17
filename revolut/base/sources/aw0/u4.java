package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f10557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f10558c;
    public final Clause d;
    public final Clause e;
    public final ms0.s4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f10559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f10560h;

    public u4(Integer num, Image image, k kVar, Clause clause, Clause clause2, ms0.s4 s4Var, Image image2) {
        zhm.f0 actions = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f10556a = num;
        this.f10557b = image;
        this.f10558c = kVar;
        this.d = clause;
        this.e = clause2;
        this.f = s4Var;
        this.f10559g = image2;
        this.f10560h = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj2;
        return Intrinsics.f(this.f10556a, u4Var.f10556a) && Intrinsics.f(this.f10557b, u4Var.f10557b) && Intrinsics.f(this.f10558c, u4Var.f10558c) && Intrinsics.f(this.d, u4Var.d) && Intrinsics.f(this.e, u4Var.e) && Intrinsics.f(this.f, u4Var.f) && Intrinsics.f(this.f10559g, u4Var.f10559g) && Intrinsics.f(this.f10560h, u4Var.f10560h);
    }

    public final int hashCode() {
        Integer num = this.f10556a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Image image = this.f10557b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        k kVar = this.f10558c;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode4 = (iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iHashCode5 = (iHashCode4 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        ms0.s4 s4Var = this.f;
        int iHashCode6 = (iHashCode5 + (s4Var == null ? 0 : s4Var.hashCode())) * 31;
        Image image2 = this.f10559g;
        return this.f10560h.hashCode() + ((iHashCode6 + (image2 != null ? image2.hashCode() : 0)) * 31);
    }
}
