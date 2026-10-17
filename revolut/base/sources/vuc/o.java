package vuc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f292332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f292333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f292334c;
    public final String d;
    public final boolean e;

    public o(TextLocalisedClause title, Clause subtitle, ArrayList tabs, String str, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f292332a = title;
        this.f292333b = subtitle;
        this.f292334c = tabs;
        this.d = str;
        this.e = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof o ? (o) oldState : null) == null) {
            return null;
        }
        return new n(!r6.f292332a.equals(this.f292332a), !r6.f292333b.equals(this.f292333b), !r6.f292334c.equals(this.f292334c), !Intrinsics.f(r6.d, this.d));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f292332a.equals(oVar.f292332a) && this.f292333b.equals(oVar.f292333b) && this.f292334c.equals(oVar.f292334c) && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f292334c, p.a.a(this.f292332a.hashCode() * 31, 31, this.f292333b), 31);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
