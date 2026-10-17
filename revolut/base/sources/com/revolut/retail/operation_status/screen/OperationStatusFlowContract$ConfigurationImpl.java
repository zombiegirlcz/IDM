package com.revolut.retail.operation_status.screen;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ho.n;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v01.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/operation_status/screen/OperationStatusFlowContract$ConfigurationImpl", "Lcom/revolut/retail/operation_status/screen/OperationStatusFlowContract$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class OperationStatusFlowContract$ConfigurationImpl implements OperationStatusFlowContract$Configuration, Parcelable {

    @NotNull
    public static final Parcelable.Creator<OperationStatusFlowContract$ConfigurationImpl> CREATOR = new a();
    public final n A;
    public final n B;
    public final n C;
    public final Video D;
    public final boolean E;
    public final boolean F;
    public final e3l.a G;
    public final AnalyticsProduct H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f104403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f104404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f104405c;
    public final NaviCommand d;
    public final String e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f104406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NaviCommand f104407h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f104408j;
    public final NaviCommand k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f104409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clause f104410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f104411n;
    public final NaviCommand o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f104412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f104413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final NaviCommand f104414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f104415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Image f104416t;
    public final boolean u;
    public final Long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f104417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f104418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Serializable f104419y;
    public final n z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            boolean z;
            boolean z3;
            NaviCommand naviCommand;
            boolean z4;
            boolean z6;
            n nVar;
            n nVar2;
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Clause clause = (Clause) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            String string = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            Clause clause3 = (Clause) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            Clause clause4 = (Clause) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            NaviCommand naviCommand4 = (NaviCommand) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            String string2 = parcel.readString();
            Clause clause5 = (Clause) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            NaviCommand naviCommand5 = (NaviCommand) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            boolean z12 = true;
            int i = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            NaviCommand naviCommand6 = (NaviCommand) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z12 = false;
            }
            Image image = (Image) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = false;
                naviCommand = naviCommand5;
                z4 = z;
            } else {
                z3 = false;
                naviCommand = naviCommand5;
                z4 = false;
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z29 = z;
            Long l2 = lValueOf;
            Serializable serializable = parcel.readSerializable();
            n nVar3 = (n) parcel.readSerializable();
            n nVar4 = (n) parcel.readSerializable();
            n nVar5 = (n) parcel.readSerializable();
            n nVar6 = (n) parcel.readSerializable();
            Video video = (Video) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z6 = z29;
                nVar = nVar4;
                nVar2 = nVar6;
                z11 = z6;
            } else {
                z6 = z29;
                nVar = nVar4;
                nVar2 = nVar6;
                z11 = z3;
            }
            if (parcel.readInt() == 0) {
                z6 = z3;
            }
            return new OperationStatusFlowContract$ConfigurationImpl(clause, clause2, charSequence, naviCommand2, string, bVar, clause3, naviCommand3, clause4, boolValueOf, naviCommand4, string2, clause5, boolValueOf2, naviCommand, i, numValueOf, naviCommand6, z12, image, z4, l2, string3, numValueOf2, serializable, nVar3, nVar, nVar5, nVar2, video, z11, z6, e3l.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(OperationStatusFlowContract$ConfigurationImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OperationStatusFlowContract$ConfigurationImpl[i];
        }
    }

    public OperationStatusFlowContract$ConfigurationImpl(Clause clause, Clause clause2, CharSequence charSequence, NaviCommand naviCommand, String str, b bVar, Clause clause3, NaviCommand naviCommand2, Clause clause4, Boolean bool, NaviCommand naviCommand3, String str2, Clause clause5, Boolean bool2, NaviCommand naviCommand4, int i, Integer num, NaviCommand naviCommand5, boolean z, Image image, boolean z3, Long l2, String str3, Integer num2, Serializable serializable, n nVar, n nVar2, n nVar3, n nVar4, Video video, boolean z4, boolean z6, e3l.a operationStatusType, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(operationStatusType, "operationStatusType");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f104403a = clause;
        this.f104404b = clause2;
        this.f104405c = charSequence;
        this.d = naviCommand;
        this.e = str;
        this.f = bVar;
        this.f104406g = clause3;
        this.f104407h = naviCommand2;
        this.i = clause4;
        this.f104408j = bool;
        this.k = naviCommand3;
        this.f104409l = str2;
        this.f104410m = clause5;
        this.f104411n = bool2;
        this.o = naviCommand4;
        this.f104412p = i;
        this.f104413q = num;
        this.f104414r = naviCommand5;
        this.f104415s = z;
        this.f104416t = image;
        this.u = z3;
        this.v = l2;
        this.f104417w = str3;
        this.f104418x = num2;
        this.f104419y = serializable;
        this.z = nVar;
        this.A = nVar2;
        this.B = nVar3;
        this.C = nVar4;
        this.D = video;
        this.E = z4;
        this.F = z6;
        this.G = operationStatusType;
        this.H = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OperationStatusFlowContract$ConfigurationImpl)) {
            return false;
        }
        OperationStatusFlowContract$ConfigurationImpl operationStatusFlowContract$ConfigurationImpl = (OperationStatusFlowContract$ConfigurationImpl) obj2;
        return Intrinsics.f(this.f104403a, operationStatusFlowContract$ConfigurationImpl.f104403a) && Intrinsics.f(this.f104404b, operationStatusFlowContract$ConfigurationImpl.f104404b) && Intrinsics.f(this.f104405c, operationStatusFlowContract$ConfigurationImpl.f104405c) && Intrinsics.f(this.d, operationStatusFlowContract$ConfigurationImpl.d) && Intrinsics.f(this.e, operationStatusFlowContract$ConfigurationImpl.e) && Intrinsics.f(this.f, operationStatusFlowContract$ConfigurationImpl.f) && Intrinsics.f(this.f104406g, operationStatusFlowContract$ConfigurationImpl.f104406g) && Intrinsics.f(this.f104407h, operationStatusFlowContract$ConfigurationImpl.f104407h) && Intrinsics.f(this.i, operationStatusFlowContract$ConfigurationImpl.i) && Intrinsics.f(this.f104408j, operationStatusFlowContract$ConfigurationImpl.f104408j) && Intrinsics.f(this.k, operationStatusFlowContract$ConfigurationImpl.k) && Intrinsics.f(this.f104409l, operationStatusFlowContract$ConfigurationImpl.f104409l) && Intrinsics.f(this.f104410m, operationStatusFlowContract$ConfigurationImpl.f104410m) && Intrinsics.f(this.f104411n, operationStatusFlowContract$ConfigurationImpl.f104411n) && Intrinsics.f(this.o, operationStatusFlowContract$ConfigurationImpl.o) && this.f104412p == operationStatusFlowContract$ConfigurationImpl.f104412p && Intrinsics.f(this.f104413q, operationStatusFlowContract$ConfigurationImpl.f104413q) && Intrinsics.f(this.f104414r, operationStatusFlowContract$ConfigurationImpl.f104414r) && this.f104415s == operationStatusFlowContract$ConfigurationImpl.f104415s && Intrinsics.f(this.f104416t, operationStatusFlowContract$ConfigurationImpl.f104416t) && this.u == operationStatusFlowContract$ConfigurationImpl.u && Intrinsics.f(this.v, operationStatusFlowContract$ConfigurationImpl.v) && Intrinsics.f(this.f104417w, operationStatusFlowContract$ConfigurationImpl.f104417w) && Intrinsics.f(this.f104418x, operationStatusFlowContract$ConfigurationImpl.f104418x) && Intrinsics.f(this.f104419y, operationStatusFlowContract$ConfigurationImpl.f104419y) && Intrinsics.f(this.z, operationStatusFlowContract$ConfigurationImpl.z) && Intrinsics.f(this.A, operationStatusFlowContract$ConfigurationImpl.A) && Intrinsics.f(this.B, operationStatusFlowContract$ConfigurationImpl.B) && Intrinsics.f(this.C, operationStatusFlowContract$ConfigurationImpl.C) && Intrinsics.f(this.D, operationStatusFlowContract$ConfigurationImpl.D) && this.E == operationStatusFlowContract$ConfigurationImpl.E && this.F == operationStatusFlowContract$ConfigurationImpl.F && this.G == operationStatusFlowContract$ConfigurationImpl.G && Intrinsics.f(this.H, operationStatusFlowContract$ConfigurationImpl.H);
    }

    public final int hashCode() {
        Clause clause = this.f104403a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f104404b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        CharSequence charSequence = this.f104405c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        NaviCommand naviCommand = this.d;
        int iHashCode4 = (iHashCode3 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Clause clause3 = this.f104406g;
        int iHashCode7 = (iHashCode6 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        NaviCommand naviCommand2 = this.f104407h;
        int iHashCode8 = (iHashCode7 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31;
        Clause clause4 = this.i;
        int iHashCode9 = (iHashCode8 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Boolean bool = this.f104408j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        NaviCommand naviCommand3 = this.k;
        int iHashCode11 = (iHashCode10 + (naviCommand3 == null ? 0 : naviCommand3.hashCode())) * 31;
        String str2 = this.f104409l;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Clause clause5 = this.f104410m;
        int iHashCode13 = (iHashCode12 + (clause5 == null ? 0 : clause5.hashCode())) * 31;
        Boolean bool2 = this.f104411n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NaviCommand naviCommand4 = this.o;
        int iB = j6.a.b(this.f104412p, (iHashCode14 + (naviCommand4 == null ? 0 : naviCommand4.hashCode())) * 31, 31);
        Integer num = this.f104413q;
        int iHashCode15 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        NaviCommand naviCommand5 = this.f104414r;
        int iC = j6.a.c((iHashCode15 + (naviCommand5 == null ? 0 : naviCommand5.hashCode())) * 31, 31, this.f104415s);
        Image image = this.f104416t;
        int iC2 = j6.a.c((iC + (image == null ? 0 : image.hashCode())) * 31, 31, this.u);
        Long l2 = this.v;
        int iHashCode16 = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f104417w;
        int iHashCode17 = (iHashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f104418x;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Serializable serializable = this.f104419y;
        int iHashCode19 = (iHashCode18 + (serializable == null ? 0 : serializable.hashCode())) * 31;
        n nVar = this.z;
        int iHashCode20 = (iHashCode19 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.A;
        int iHashCode21 = (iHashCode20 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n nVar3 = this.B;
        int iHashCode22 = (iHashCode21 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
        n nVar4 = this.C;
        int iHashCode23 = (iHashCode22 + (nVar4 == null ? 0 : nVar4.hashCode())) * 31;
        Video video = this.D;
        return this.H.hashCode() + ((this.G.hashCode() + j6.a.c(j6.a.c((iHashCode23 + (video != null ? video.hashCode() : 0)) * 31, 31, this.E), 31, this.F)) * 31);
    }

    @Override // com.revolut.retail.operation_status.step.OperationStatusStepContract$Configuration
    /* JADX INFO: renamed from: i6, reason: from getter */
    public final AnalyticsProduct getH() {
        return this.H;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104403a, i);
        dest.writeParcelable(this.f104404b, i);
        TextUtils.writeToParcel(this.f104405c, dest, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeParcelable(this.f104406g, i);
        dest.writeParcelable(this.f104407h, i);
        dest.writeParcelable(this.i, i);
        Boolean bool = this.f104408j;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeParcelable(this.k, i);
        dest.writeString(this.f104409l);
        dest.writeParcelable(this.f104410m, i);
        Boolean bool2 = this.f104411n;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        dest.writeParcelable(this.o, i);
        dest.writeInt(this.f104412p);
        Integer num = this.f104413q;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f104414r, i);
        dest.writeInt(this.f104415s ? 1 : 0);
        dest.writeParcelable(this.f104416t, i);
        dest.writeInt(this.u ? 1 : 0);
        Long l2 = this.v;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeString(this.f104417w);
        Integer num2 = this.f104418x;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeSerializable(this.f104419y);
        dest.writeSerializable(this.z);
        dest.writeSerializable(this.A);
        dest.writeSerializable(this.B);
        dest.writeSerializable(this.C);
        dest.writeParcelable(this.D, i);
        dest.writeInt(this.E ? 1 : 0);
        dest.writeInt(this.F ? 1 : 0);
        dest.writeString(this.G.name());
        dest.writeParcelable(this.H, i);
    }

    public /* synthetic */ OperationStatusFlowContract$ConfigurationImpl(Clause clause, Clause clause2, TextClause textClause, Clause clause3, NaviCommand naviCommand, String str, FinishCommand finishCommand, int i, Image image, e3l.a aVar, AnalyticsProduct.Retail retail, int i2) {
        this(clause, clause2, null, null, null, null, textClause, null, clause3, null, naviCommand, (i2 & 2048) != 0 ? null : str, null, null, finishCommand, i, null, null, false, image, true, null, null, null, null, null, null, null, null, null, true, true, aVar, retail);
    }
}
