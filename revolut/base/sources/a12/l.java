package a12;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f476c;
    public final String d;
    public final Integer e;

    public l(TextLocalisedClause title, TextLocalisedClause subtitle, String qrText, String copyValue, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(qrText, "qrText");
        Intrinsics.checkNotNullParameter(copyValue, "copyValue");
        this.f474a = title;
        this.f475b = subtitle;
        this.f476c = qrText;
        this.d = copyValue;
        this.e = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f474a.equals(lVar.f474a) && this.f475b.equals(lVar.f475b) && Intrinsics.f(this.f476c, lVar.f476c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(t61.a.a(this.f474a.hashCode() * 31, 31, this.f475b), 31, this.f476c), 31, this.d);
        Integer num = this.e;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
