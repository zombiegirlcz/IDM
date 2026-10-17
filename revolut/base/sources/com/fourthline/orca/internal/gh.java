package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrzInfo;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fh f28884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fh f28885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fh f28886c;
    private final fh d;
    private final List e;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gh(fh userInputDocumentBundle, fh nfcDocumentBundle, fh remoteOcrDocumentBundle, fh localOcrDocumentBundle) {
        Intrinsics.checkNotNullParameter(userInputDocumentBundle, "userInputDocumentBundle");
        Intrinsics.checkNotNullParameter(nfcDocumentBundle, "nfcDocumentBundle");
        Intrinsics.checkNotNullParameter(remoteOcrDocumentBundle, "remoteOcrDocumentBundle");
        Intrinsics.checkNotNullParameter(localOcrDocumentBundle, "localOcrDocumentBundle");
        this.f28884a = userInputDocumentBundle;
        this.f28885b = nfcDocumentBundle;
        this.f28886c = remoteOcrDocumentBundle;
        this.d = localOcrDocumentBundle;
        this.e = zhm.v.k(userInputDocumentBundle, nfcDocumentBundle, remoteOcrDocumentBundle, localOcrDocumentBundle);
    }

    private final boolean a(String str) {
        int length;
        return !kotlin.text.d0.W(str) && 6 <= (length = str.length()) && length < 17;
    }

    private final boolean j() {
        ub0 ub0VarH = h();
        if (ub0VarH != null) {
            return ub0VarH.i();
        }
        return true;
    }

    private final boolean n() {
        DocumentType documentTypeM = m();
        int i = documentTypeM == null ? -1 : a.$EnumSwitchMapping$0[documentTypeM.ordinal()];
        return (i == -1 || i == 1 || i == 2) ? false : true;
    }

    public final boolean b() {
        String strK = k();
        if (strK != null) {
            return a(strK);
        }
        return false;
    }

    public final Date c() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            Date dateB = ((fh) it8.next()).b();
            if (dateB != null) {
                return dateB;
            }
        }
        return null;
    }

    public final List d() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            List listC = ((fh) it8.next()).c();
            if (listC != null) {
                return listC;
            }
        }
        return null;
    }

    public final Date e() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            Date dateD = ((fh) it8.next()).d();
            if (dateD != null) {
                return dateD;
            }
        }
        return null;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj2;
        return Intrinsics.f(this.f28884a, ghVar.f28884a) && Intrinsics.f(this.f28885b, ghVar.f28885b) && Intrinsics.f(this.f28886c, ghVar.f28886c) && Intrinsics.f(this.d, ghVar.d);
    }

    public final fh f() {
        return this.d;
    }

    public final MrzInfo g() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            MrzInfo mrzInfoE = ((fh) it8.next()).e();
            if (mrzInfoE != null) {
                return mrzInfoE;
            }
        }
        return null;
    }

    public final ub0 h() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            ub0 ub0VarF = ((fh) it8.next()).f();
            if (ub0VarF != null) {
                return ub0VarF;
            }
        }
        return null;
    }

    public int hashCode() {
        return (((((this.f28884a.hashCode() * 31) + this.f28885b.hashCode()) * 31) + this.f28886c.hashCode()) * 31) + this.d.hashCode();
    }

    public final fh i() {
        return this.f28885b;
    }

    public final String k() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            String strG = ((fh) it8.next()).g();
            if (strG != null) {
                return strG;
            }
        }
        return null;
    }

    public final fh l() {
        return this.f28886c;
    }

    public final DocumentType m() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            DocumentType documentTypeH = ((fh) it8.next()).h();
            if (documentTypeH != null) {
                return documentTypeH;
            }
        }
        return null;
    }

    public final fh o() {
        return this.f28884a;
    }

    public final boolean p() {
        return n() && b() && l8.a(e()) && l8.a(d()) && j();
    }

    public final VideoRecording q() {
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            VideoRecording videoRecordingI = ((fh) it8.next()).i();
            if (videoRecordingI != null) {
                return videoRecordingI;
            }
        }
        return null;
    }

    public String toString() {
        return "DocumentBundleByPriority(userInputDocumentBundle=" + this.f28884a + ", nfcDocumentBundle=" + this.f28885b + ", remoteOcrDocumentBundle=" + this.f28886c + ", localOcrDocumentBundle=" + this.d + ")";
    }

    public final void a() {
        this.d.a();
        this.f28886c.a();
        this.f28884a.a();
        this.f28885b.a();
    }
}
