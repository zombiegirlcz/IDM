package com.revolut.kompot.common.flow.navigation;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nhi.j;
import org.jetbrains.annotations.NotNull;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/flow/navigation/NavigationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Step", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavigationFlow extends ViewController<q> implements f {
    public final int K;
    public final a L;
    public final Object M;
    public final xki.a N;
    public final Object O;
    public final o6.a P;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/kompot/common/flow/navigation/NavigationFlow$Step;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InitialController", "StackDestinationStep", "Lcom/revolut/kompot/common/flow/navigation/NavigationFlow$Step$InitialController;", "Lcom/revolut/kompot/common/flow/navigation/NavigationFlow$Step$StackDestinationStep;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Step implements FlowStep {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/flow/navigation/NavigationFlow$Step$InitialController;", "Lcom/revolut/kompot/common/flow/navigation/NavigationFlow$Step;", "<init>", "()V", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InitialController extends Step {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InitialController f98334a = new InitialController();

            @NotNull
            public static final Parcelable.Creator<InitialController> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InitialController.f98334a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InitialController[i];
                }
            }

            private InitialController() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/flow/navigation/NavigationFlow$Step$StackDestinationStep;", "Lcom/revolut/kompot/common/flow/navigation/NavigationFlow$Step;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StackDestinationStep extends Step {

            @NotNull
            public static final Parcelable.Creator<StackDestinationStep> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StackDestination f98335a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new StackDestinationStep((StackDestination) parcel.readParcelable(StackDestinationStep.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new StackDestinationStep[i];
                }
            }

            public StackDestinationStep(StackDestination destination) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                this.f98335a = destination;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof StackDestinationStep) && Intrinsics.f(this.f98335a, ((StackDestinationStep) obj2).f98335a);
            }

            public final int hashCode() {
                return this.f98335a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f98335a, i);
            }
        }

        private Step() {
        }
    }

    public NavigationFlow(com.revolut.kompot.navigable.a controller, j featuresRegistry, com.revolut.kompot.bridge.impl.rootflow.a baseFlowModel) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(featuresRegistry, "featuresRegistry");
        Intrinsics.checkNotNullParameter(baseFlowModel, "baseFlowModel");
        this.K = R$layout.base_flow_container;
        this.L = new a(controller, featuresRegistry, baseFlowModel);
        this.M = w.y0(new r1a.a(this, 15));
        this.N = xki.a.f306815a;
        this.O = new Object();
        this.P = new o6.a(this, 19);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0011, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zv0.a d3() {
        /*
            r3 = this;
            android.view.View r0 = r3.D2()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L10
            android.view.View r0 = (android.view.View) r0
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L23
            boolean r1 = r0 instanceof zv0.a
            if (r1 == 0) goto L18
            goto L24
        L18:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            android.view.View r0 = (android.view.View) r0
            goto L11
        L23:
            r0 = r2
        L24:
            boolean r1 = r0 instanceof zv0.a
            if (r1 == 0) goto L2b
            zv0.a r0 = (zv0.a) r0
            return r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.kompot.common.flow.navigation.NavigationFlow.d3():zv0.a");
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
