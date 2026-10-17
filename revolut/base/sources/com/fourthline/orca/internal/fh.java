package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrzInfo;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DocumentType f28503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f28505c;
    private Date d;
    private List e;
    private ub0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VideoRecording f28506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f28507h;
    private MrzInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final UUID f28508j;

    public fh(DocumentType documentType, String str, Date date, Date date2, List list, ub0 ub0Var, VideoRecording videoRecording, String str2, MrzInfo mrzInfo, UUID videoUUID) {
        Intrinsics.checkNotNullParameter(videoUUID, "videoUUID");
        this.f28503a = documentType;
        this.f28504b = str;
        this.f28505c = date;
        this.d = date2;
        this.e = list;
        this.f = ub0Var;
        this.f28506g = videoRecording;
        this.f28507h = str2;
        this.i = mrzInfo;
        this.f28508j = videoUUID;
    }

    public final void a(DocumentType documentType) {
        this.f28503a = documentType;
    }

    public final void b(Date date) {
        this.f28505c = date;
    }

    public final List c() {
        return this.e;
    }

    public final Date d() {
        return this.f28505c;
    }

    public final MrzInfo e() {
        return this.i;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj2;
        return this.f28503a == fhVar.f28503a && Intrinsics.f(this.f28504b, fhVar.f28504b) && Intrinsics.f(this.f28505c, fhVar.f28505c) && Intrinsics.f(this.d, fhVar.d) && Intrinsics.f(this.e, fhVar.e) && Intrinsics.f(this.f, fhVar.f) && Intrinsics.f(this.f28506g, fhVar.f28506g) && Intrinsics.f(this.f28507h, fhVar.f28507h) && Intrinsics.f(this.i, fhVar.i) && Intrinsics.f(this.f28508j, fhVar.f28508j);
    }

    public final ub0 f() {
        return this.f;
    }

    public final String g() {
        return this.f28504b;
    }

    public final DocumentType h() {
        return this.f28503a;
    }

    public int hashCode() {
        DocumentType documentType = this.f28503a;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        String str = this.f28504b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f28505c;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.d;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ub0 ub0Var = this.f;
        int iHashCode6 = (iHashCode5 + (ub0Var == null ? 0 : ub0Var.hashCode())) * 31;
        VideoRecording videoRecording = this.f28506g;
        int iHashCode7 = (iHashCode6 + (videoRecording == null ? 0 : videoRecording.hashCode())) * 31;
        String str2 = this.f28507h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MrzInfo mrzInfo = this.i;
        return ((iHashCode8 + (mrzInfo != null ? mrzInfo.hashCode() : 0)) * 31) + this.f28508j.hashCode();
    }

    public final VideoRecording i() {
        return this.f28506g;
    }

    public String toString() {
        return "DocumentBundle(type=" + this.f28503a + ", number=" + this.f28504b + ", issueDate=" + this.f28505c + ", expirationDate=" + this.d + ", images=" + this.e + ", nfc=" + this.f + ", videoRecording=" + this.f28506g + ", rawMrz=" + this.f28507h + ", mrzInfo=" + this.i + ", videoUUID=" + this.f28508j + ")";
    }

    public final void a(String str) {
        this.f28504b = str;
    }

    public final Date b() {
        return this.d;
    }

    public final void a(Date date) {
        this.d = date;
    }

    public final void b(String str) {
        this.f28507h = str;
    }

    public final void a(List list) {
        this.e = list;
    }

    public final void a(ub0 ub0Var) {
        this.f = ub0Var;
    }

    public final void a(VideoRecording videoRecording) {
        this.f28506g = videoRecording;
    }

    public final void a(MrzInfo mrzInfo) {
        this.i = mrzInfo;
    }

    public final void a() {
        this.f28503a = null;
        this.f28504b = null;
        this.f28505c = null;
        this.d = null;
        this.e = null;
        this.f28506g = null;
        this.f28507h = null;
        this.i = null;
        this.f = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fh(DocumentType documentType, String str, Date date, Date date2, List list, ub0 ub0Var, VideoRecording videoRecording, String str2, MrzInfo mrzInfo, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        documentType = (i & 1) != 0 ? null : documentType;
        str = (i & 2) != 0 ? null : str;
        date = (i & 4) != 0 ? null : date;
        date2 = (i & 8) != 0 ? null : date2;
        list = (i & 16) != 0 ? null : list;
        ub0Var = (i & 32) != 0 ? null : ub0Var;
        videoRecording = (i & 64) != 0 ? null : videoRecording;
        str2 = (i & 128) != 0 ? null : str2;
        mrzInfo = (i & 256) != 0 ? null : mrzInfo;
        if ((i & 512) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
        this(documentType, str, date, date2, list, ub0Var, videoRecording, str2, mrzInfo, uuid);
    }
}
