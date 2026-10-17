package com.revolut.shared.feature.user_declarations.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.user_declarations.api.models.NamePrefill;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/user_declarations/api/navigation/NameControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NameControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NameControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f105054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105056c;
    public final pbl.b d;
    public final rbl.a e;
    public final pbl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NamePrefill f105057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WorkflowScreenConfiguration f105058h;
    public final Integer i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new NameControllerDescriptor$InputData(bVar, z3, parcel.readInt() == 0 ? z : true, pbl.b.valueOf(parcel.readString()), rbl.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : pbl.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : NamePrefill.CREATOR.createFromParcel(parcel), (WorkflowScreenConfiguration) parcel.readParcelable(NameControllerDescriptor$InputData.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NameControllerDescriptor$InputData[i];
        }
    }

    public NameControllerDescriptor$InputData(b country, boolean z, boolean z3, pbl.b screenMode, rbl.a backNavigationType, pbl.a aVar, NamePrefill namePrefill, WorkflowScreenConfiguration workflowScreenConfiguration, Integer num) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f105054a = country;
        this.f105055b = z;
        this.f105056c = z3;
        this.d = screenMode;
        this.e = backNavigationType;
        this.f = aVar;
        this.f105057g = namePrefill;
        this.f105058h = workflowScreenConfiguration;
        this.i = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NameControllerDescriptor$InputData)) {
            return false;
        }
        NameControllerDescriptor$InputData nameControllerDescriptor$InputData = (NameControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f105054a, nameControllerDescriptor$InputData.f105054a) && this.f105055b == nameControllerDescriptor$InputData.f105055b && this.f105056c == nameControllerDescriptor$InputData.f105056c && this.d == nameControllerDescriptor$InputData.d && this.e == nameControllerDescriptor$InputData.e && this.f == nameControllerDescriptor$InputData.f && Intrinsics.f(this.f105057g, nameControllerDescriptor$InputData.f105057g) && Intrinsics.f(this.f105058h, nameControllerDescriptor$InputData.f105058h) && Intrinsics.f(this.i, nameControllerDescriptor$InputData.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + j6.a.c(j6.a.c(this.f105054a.f297794a.hashCode() * 31, 31, this.f105055b), 31, this.f105056c)) * 31)) * 31;
        pbl.a aVar = this.f;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        NamePrefill namePrefill = this.f105057g;
        int iHashCode3 = (iHashCode2 + (namePrefill == null ? 0 : namePrefill.hashCode())) * 31;
        WorkflowScreenConfiguration workflowScreenConfiguration = this.f105058h;
        int iHashCode4 = (iHashCode3 + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105054a);
        dest.writeInt(this.f105055b ? 1 : 0);
        dest.writeInt(this.f105056c ? 1 : 0);
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        pbl.a aVar = this.f;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        NamePrefill namePrefill = this.f105057g;
        if (namePrefill == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            namePrefill.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f105058h, i);
        Integer num = this.i;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ NameControllerDescriptor$InputData(wi0.b r13, boolean r14, boolean r15, pbl.b r16, rbl.a r17, pbl.a r18, com.revolut.shared.feature.user_declarations.api.models.NamePrefill r19, com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration r20, java.lang.Integer r21, int r22) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto La
            pbl.b r1 = pbl.b.DECLARATION
            r6 = r1
            goto Lc
        La:
            r6 = r16
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L14
            rbl.a r1 = rbl.a.NONE
            r7 = r1
            goto L16
        L14:
            r7 = r17
        L16:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L1d
            r8 = r2
            goto L1f
        L1d:
            r8 = r18
        L1f:
            r1 = r0 & 64
            if (r1 == 0) goto L25
            r9 = r2
            goto L27
        L25:
            r9 = r19
        L27:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2d
            r10 = r2
            goto L2f
        L2d:
            r10 = r20
        L2f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L39
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r2 = r12
            goto L3f
        L39:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
        L3f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData.<init>(wi0.b, boolean, boolean, pbl.b, rbl.a, pbl.a, com.revolut.shared.feature.user_declarations.api.models.NamePrefill, com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration, java.lang.Integer, int):void");
    }
}
