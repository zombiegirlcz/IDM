package ub;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.view.result.ActivityResultLauncher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f278708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final State f278709c;
    public final State d;
    public ActivityResultLauncher e;

    public c(List mutablePermissions) {
        Intrinsics.checkNotNullParameter(mutablePermissions, "mutablePermissions");
        this.f278707a = mutablePermissions;
        this.f278708b = mutablePermissions;
        final int i = 0;
        this.f278709c = SnapshotStateKt.derivedStateOf(new Function0(this) { // from class: ub.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f278706b;

            {
                this.f278706b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                boolean z3;
                switch (i) {
                    case 0:
                        List list = this.f278706b.f278708b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!Intrinsics.f(((g) obj2).getStatus(), i.f278718a)) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 1:
                        c cVar = this.f278706b;
                        List list2 = cVar.f278708b;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it8 = list2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    j status = ((g) it8.next()).getStatus();
                                    Intrinsics.checkNotNullParameter(status, "<this>");
                                    if (!Intrinsics.f(status, i.f278718a)) {
                                        if (!((List) cVar.f278709c.getValue()).isEmpty()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        List list3 = this.f278706b.f278708b;
                        List list4 = list3;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it9 = list4.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    if (m.b(((g) it9.next()).getStatus())) {
                                        List<g> list5 = list3;
                                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                            for (g gVar : list5) {
                                                j status2 = gVar.getStatus();
                                                Intrinsics.checkNotNullParameter(status2, "<this>");
                                                if (Intrinsics.f(status2, i.f278718a) || m.b(gVar.getStatus())) {
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i2 = 1;
        this.d = SnapshotStateKt.derivedStateOf(new Function0(this) { // from class: ub.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f278706b;

            {
                this.f278706b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                boolean z3;
                switch (i2) {
                    case 0:
                        List list = this.f278706b.f278708b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!Intrinsics.f(((g) obj2).getStatus(), i.f278718a)) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 1:
                        c cVar = this.f278706b;
                        List list2 = cVar.f278708b;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it8 = list2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    j status = ((g) it8.next()).getStatus();
                                    Intrinsics.checkNotNullParameter(status, "<this>");
                                    if (!Intrinsics.f(status, i.f278718a)) {
                                        if (!((List) cVar.f278709c.getValue()).isEmpty()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        List list3 = this.f278706b.f278708b;
                        List list4 = list3;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it9 = list4.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    if (m.b(((g) it9.next()).getStatus())) {
                                        List<g> list5 = list3;
                                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                            for (g gVar : list5) {
                                                j status2 = gVar.getStatus();
                                                Intrinsics.checkNotNullParameter(status2, "<this>");
                                                if (Intrinsics.f(status2, i.f278718a) || m.b(gVar.getStatus())) {
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final int i3 = 2;
        SnapshotStateKt.derivedStateOf(new Function0(this) { // from class: ub.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f278706b;

            {
                this.f278706b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z;
                boolean z3;
                switch (i3) {
                    case 0:
                        List list = this.f278706b.f278708b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!Intrinsics.f(((g) obj2).getStatus(), i.f278718a)) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 1:
                        c cVar = this.f278706b;
                        List list2 = cVar.f278708b;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it8 = list2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    j status = ((g) it8.next()).getStatus();
                                    Intrinsics.checkNotNullParameter(status, "<this>");
                                    if (!Intrinsics.f(status, i.f278718a)) {
                                        if (!((List) cVar.f278709c.getValue()).isEmpty()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        List list3 = this.f278706b.f278708b;
                        List list4 = list3;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it9 = list4.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    if (m.b(((g) it9.next()).getStatus())) {
                                        List<g> list5 = list3;
                                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                            for (g gVar : list5) {
                                                j status2 = gVar.getStatus();
                                                Intrinsics.checkNotNullParameter(status2, "<this>");
                                                if (Intrinsics.f(status2, i.f278718a) || m.b(gVar.getStatus())) {
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
    }

    @Override // ub.a
    public final void a() {
        ActivityResultLauncher activityResultLauncher = this.e;
        if (activityResultLauncher == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
        List list = this.f278708b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((g) it8.next()).W0());
        }
        activityResultLauncher.launch(arrayList.toArray(new String[0]));
    }

    @Override // ub.a
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }
}
