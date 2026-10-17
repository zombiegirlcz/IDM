package ds6;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f117240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f117241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f117242c;

    public i(a defaultPeriod, ArrayList supportedPeriods, ArrayList supportedExtraOptions) {
        Intrinsics.checkNotNullParameter(defaultPeriod, "defaultPeriod");
        Intrinsics.checkNotNullParameter(supportedPeriods, "supportedPeriods");
        Intrinsics.checkNotNullParameter(supportedExtraOptions, "supportedExtraOptions");
        this.f117240a = defaultPeriod;
        this.f117241b = supportedPeriods;
        this.f117242c = supportedExtraOptions;
    }

    public final boolean a(g gVar, a aVar) {
        Object next;
        Iterator it8 = this.f117242c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((f) next).f117235a == gVar) {
                break;
            }
        }
        f fVar = (f) next;
        if (fVar == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        return fVar.f117236b.contains(aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f117240a == iVar.f117240a && this.f117241b.equals(iVar.f117241b) && this.f117242c.equals(iVar.f117242c);
    }

    public final int hashCode() {
        return this.f117242c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f117241b, this.f117240a.hashCode() * 31, 31);
    }
}
