package mzj;

import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileActivity;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionAvailability;
import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.mdm.ServiceState;
import defpackage.o0;
import defpackage.u0;
import defpackage.v;
import defpackage.v1;
import efm.h0;
import ip0.um0;
import java.util.LinkedList;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import mx0.oc;
import n09.j0;
import n1j.t;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements o, p, CallbackToFutureAdapter.Resolver, kfm.g, ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210798b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f210797a = i;
        this.f210798b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f210797a) {
            case 13:
                ((n08.j) this.f210798b).invoke(obj2);
                break;
            default:
                ((n08.j) this.f210798b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f210797a;
        Object obj2 = this.f210798b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((i) obj2).invoke(p0);
            case 1:
            case 6:
            case 9:
            case 13:
            case 14:
            case 22:
            case 26:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((t) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((oc) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((oc) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((i) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((i) obj2).invoke(p0);
            case 7:
                int i2 = PetProfileActivity.F0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (um0) ((oc) obj2).invoke(p0);
            case 8:
                int i3 = PetProfileActivity.F0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (um0) ((oc) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((n08.j) obj2).invoke(p0);
                return pfm.m.f235744a;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n08.j) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((mt9.c) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((oc) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TravelExperiencesOptionAvailability) ((n0c.o) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((n0c.o) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((n0c.o) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) ((a7) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((n1i.a) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n1i.a) obj2).invoke(p0);
            case 23:
                return (List) ((j0) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wd6.h) ((t) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n2i.c) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((kce.e) obj2).invoke(p0);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return PipeCameraPresenceSource.fetchData$lambda$0((PipeCameraPresenceSource) this.f210798b, completer);
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        u0 u0Var = (u0) this.f210798b;
        u0Var.getClass();
        int i = o0.f221096a[taskEvent.ordinal()];
        if (i == 1) {
            u0Var.d = (ITask) objArr[0];
            u0Var.notifyMonitor(TaskEvent.FAILED, u0Var);
            return;
        }
        if (i != 2) {
            return;
        }
        u0Var.J = (byte[]) objArr[0];
        LinkedList linkedList = new LinkedList(u0Var.I);
        u0Var.K = linkedList;
        BinaryUpdate binaryUpdate = (BinaryUpdate) linkedList.poll();
        v1.a("download " + binaryUpdate.getCfg().getLabel());
        u0Var.b(ServiceState.DOWNLOAD_BINARY, binaryUpdate.getCfg(), Integer.valueOf(u0Var.K.size()));
        new v(u0Var.H, binaryUpdate, u0Var.J).execute(new zq.a(u0Var, binaryUpdate));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f210797a) {
            case 1:
                oc ocVar = (oc) this.f210798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ocVar.invoke(p0)).booleanValue();
            case 9:
                oc ocVar2 = (oc) this.f210798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ocVar2.invoke(p0)).booleanValue();
            case 26:
                t tVar = (t) this.f210798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) tVar.invoke(p0)).booleanValue();
            default:
                t tVar2 = (t) this.f210798b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) tVar2.invoke(p0)).booleanValue();
        }
    }
}
