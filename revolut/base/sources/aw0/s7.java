package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7 f10531c;
    public final m7 d;
    public final o7 e;

    public s7(List xAxisItems, List forecast, p7 p7Var, m7 startPoint, o7 forecastLastLabelPosition) {
        Intrinsics.checkNotNullParameter(xAxisItems, "xAxisItems");
        Intrinsics.checkNotNullParameter(forecast, "forecast");
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        Intrinsics.checkNotNullParameter(forecastLastLabelPosition, "forecastLastLabelPosition");
        this.f10529a = xAxisItems;
        this.f10530b = forecast;
        this.f10531c = p7Var;
        this.d = startPoint;
        this.e = forecastLastLabelPosition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj2;
        return Intrinsics.f(this.f10529a, s7Var.f10529a) && Intrinsics.f(this.f10530b, s7Var.f10530b) && Intrinsics.f(this.f10531c, s7Var.f10531c) && Intrinsics.f(this.d, s7Var.d) && this.e == s7Var.e;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f10529a.hashCode() * 31, 31, this.f10530b);
        p7 p7Var = this.f10531c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iD + (p7Var == null ? 0 : p7Var.hashCode())) * 31)) * 31);
    }
}
