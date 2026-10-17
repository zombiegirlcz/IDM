package oy6;

import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f230892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f230893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f230894c;

    public f() {
        this(0);
    }

    public static f a(f fVar, i iVar, j jVar, int i) {
        Data invoiceSettingsData = fVar.f230892a;
        if ((i & 2) != 0) {
            iVar = fVar.f230893b;
        }
        if ((i & 4) != 0) {
            jVar = fVar.f230894c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(invoiceSettingsData, "invoiceSettingsData");
        return new f(invoiceSettingsData, iVar, jVar);
    }

    public final boolean c() {
        Boolean boolValueOf;
        boolean z;
        if (this.f230892a.getContent() != null) {
            Boolean boolValueOf2 = null;
            i iVar = this.f230893b;
            if (iVar != null) {
                if (iVar instanceof g) {
                    if (((g) iVar).f230895a == null) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else if (!(iVar instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            if (pd.b.j(boolValueOf)) {
                j jVar = this.f230894c;
                if (jVar != null) {
                    boolValueOf2 = Boolean.valueOf(jVar.f230898b != null);
                }
                if (pd.b.j(boolValueOf2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f230892a, fVar.f230892a) && Intrinsics.f(this.f230893b, fVar.f230893b) && Intrinsics.f(this.f230894c, fVar.f230894c);
    }

    public final int hashCode() {
        int iHashCode = this.f230892a.hashCode() * 31;
        i iVar = this.f230893b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.f230894c;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    public f(Data invoiceSettingsData, i iVar, j jVar) {
        Intrinsics.checkNotNullParameter(invoiceSettingsData, "invoiceSettingsData");
        this.f230892a = invoiceSettingsData;
        this.f230893b = iVar;
        this.f230894c = jVar;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), null, null);
    }
}
