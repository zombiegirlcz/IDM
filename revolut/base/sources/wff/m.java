package wff;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Troubleshooter f297093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qv0.i f297094c;
    public final Data d;

    public m(String entityId, Troubleshooter troubleshooterModel, qv0.i iVar, Data feedback) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(troubleshooterModel, "troubleshooterModel");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f297092a = entityId;
        this.f297093b = troubleshooterModel;
        this.f297094c = iVar;
        this.d = feedback;
    }

    public static m a(m mVar, qv0.i iVar, Data feedback, int i) {
        String entityId = mVar.f297092a;
        Troubleshooter troubleshooterModel = mVar.f297093b;
        if ((i & 4) != 0) {
            iVar = mVar.f297094c;
        }
        if ((i & 8) != 0) {
            feedback = mVar.d;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(troubleshooterModel, "troubleshooterModel");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        return new m(entityId, troubleshooterModel, iVar, feedback);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f297092a, mVar.f297092a) && Intrinsics.f(this.f297093b, mVar.f297093b) && Intrinsics.f(this.f297094c, mVar.f297094c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f297093b.hashCode() + (this.f297092a.hashCode() * 31)) * 31;
        qv0.i iVar = this.f297094c;
        return this.d.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
