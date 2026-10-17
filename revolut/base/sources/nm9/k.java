package nm9;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.m f217226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217227c;
    public final TextLocalisedClause d;

    public k(List items, lw0.m headerModel, boolean z, TextLocalisedClause confirmButtonText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        this.f217225a = items;
        this.f217226b = headerModel;
        this.f217227c = z;
        this.d = confirmButtonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f217225a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f217225a, kVar.f217225a) && this.f217226b.equals(kVar.f217226b) && this.f217227c == kVar.f217227c && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f217226b.hashCode() + (this.f217225a.hashCode() * 31)) * 31, 31, this.f217227c);
    }
}
