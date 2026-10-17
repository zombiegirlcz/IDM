package com.fourthline.orca.workflow;

import android.graphics.Bitmap;
import com.fourthline.core.DeviceMetaDataValidationError;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.LocationProviderKt;
import com.fourthline.orca.internal.b01;
import com.fourthline.orca.internal.eb;
import com.fourthline.orca.internal.eh;
import com.fourthline.orca.internal.gh;
import com.fourthline.orca.internal.l81;
import com.fourthline.orca.internal.ub0;
import com.fourthline.orca.internal.uc1;
import com.fourthline.orca.internal.xj0;
import com.fourthline.orca.internal.xz0;
import com.fourthline.orca.internal.z;
import com.fourthline.orca.workflow.WorkflowResults;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010(\u001a\u0004\u0018\u00010'*\u00020&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010,\u001a\u0004\u0018\u00010+*\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a'\u00101\u001a\u0004\u0018\u000100*\u00020*2\u0006\u0010.\u001a\u00020\u00012\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b1\u00102\u001a\u0015\u00105\u001a\u0004\u0018\u000104*\u000203H\u0000¢\u0006\u0004\b5\u00106\u001a\u0015\u00109\u001a\u0004\u0018\u000108*\u000207H\u0000¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/fourthline/orca/internal/gh;", "", "issuingCountry", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "asWorkflowDataDocument", "(Lcom/fourthline/orca/internal/gh;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "documentId", "imageId", "asWorkflowDataImage", "(Lcom/fourthline/orca/internal/gh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "Lcom/fourthline/orca/internal/xz0;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "asWorkflowDataSecondaryDocument", "(Lcom/fourthline/orca/internal/xz0;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "", "videoBytes", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DocumentVideo;", "asWorkflowDataDocumentVideo", "(Lcom/fourthline/orca/internal/gh;[B)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DocumentVideo;", "Lcom/fourthline/orca/internal/b01;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "asWorkflowDataSelfie", "(Lcom/fourthline/orca/internal/b01;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SelfieVideo;", "asWorkflowDataSelfieVideo", "(Lcom/fourthline/orca/internal/b01;[B)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SelfieVideo;", "Lcom/fourthline/orca/internal/eh;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "asWorkflowDataAttachment", "(Lcom/fourthline/orca/internal/eh;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "Lcom/fourthline/orca/internal/ub0;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "asWorkflowDataNfc", "(Lcom/fourthline/orca/internal/ub0;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "Lcom/fourthline/orca/internal/z;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "asWorkflowDataAddress", "(Lcom/fourthline/orca/internal/z;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "Lcom/fourthline/orca/internal/xj0;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "asWorkflowDataPerson", "(Lcom/fourthline/orca/internal/xj0;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "Lcom/fourthline/core/DeviceMetadata;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "asWorkflowGeolocation", "(Lcom/fourthline/core/DeviceMetadata;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "appTrackerId", "analyticsId", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "asWorkflowDataMetadata", "(Lcom/fourthline/core/DeviceMetadata;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "Lcom/fourthline/orca/internal/l81;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "asWorkflowDataTaxInfo", "(Lcom/fourthline/orca/internal/l81;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "Lcom/fourthline/orca/internal/eb;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "asWorkflowDataContacts", "(Lcom/fourthline/orca/internal/eb;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "fourthline-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class WorkflowResultsKt {
    public static final WorkflowResults.IDV.Address asWorkflowDataAddress(@NotNull z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (!zVar.m()) {
            return null;
        }
        String strH = zVar.h();
        if (strH == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strH) + " must not be null."))).toString());
        }
        Integer numI = zVar.i();
        if (numI == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + numI + " must not be null."))).toString());
        }
        int iIntValue = numI.intValue();
        String strJ = zVar.j();
        String strE = zVar.e();
        if (strE == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strE) + " must not be null."))).toString());
        }
        String strA = zVar.a();
        if (strA == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
        }
        String strC = zVar.c();
        if (strC != null) {
            return new WorkflowResults.IDV.Address(strH, iIntValue, strJ, strE, strA, strC, zVar.g());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strC) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Attachment asWorkflowDataAttachment(@NotNull eh ehVar) {
        Intrinsics.checkNotNullParameter(ehVar, "<this>");
        if (!ehVar.g()) {
            return null;
        }
        Bitmap bitmapC = ehVar.c();
        if (bitmapC == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + bitmapC + " must not be null."))).toString());
        }
        DocumentFileSide documentFileSideA = ehVar.a();
        if (documentFileSideA != null) {
            return new WorkflowResults.IDV.Attachment(bitmapC, documentFileSideA, ehVar.h(), ehVar.e(), ehVar.f());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentFileSideA + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Contacts asWorkflowDataContacts(@NotNull eb ebVar) {
        Intrinsics.checkNotNullParameter(ebVar, "<this>");
        if (!ebVar.e()) {
            return null;
        }
        String strA = ebVar.a();
        if (strA == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
        }
        String strC = ebVar.c();
        if (strC != null) {
            return new WorkflowResults.IDV.Contacts(strA, strC, null, 4, null);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strC) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Document asWorkflowDataDocument(@NotNull gh ghVar, String str) {
        Intrinsics.checkNotNullParameter(ghVar, "<this>");
        ArrayList arrayList = null;
        if (!ghVar.p()) {
            return null;
        }
        DocumentType documentTypeM = ghVar.m();
        if (documentTypeM == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeM + " must not be null."))).toString());
        }
        String strK = ghVar.k();
        if (strK == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strK) + " must not be null."))).toString());
        }
        Date dateE = ghVar.e();
        Date dateC = ghVar.c();
        List listD = ghVar.d();
        if (listD != null) {
            arrayList = new ArrayList();
            Iterator it8 = listD.iterator();
            while (it8.hasNext()) {
                WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = asWorkflowDataAttachment((eh) it8.next());
                if (attachmentAsWorkflowDataAttachment != null) {
                    arrayList.add(attachmentAsWorkflowDataAttachment);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null) {
            return new WorkflowResults.IDV.Document(documentTypeM, strK, dateE, str, dateC, arrayList2);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + arrayList2 + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.DocumentVideo asWorkflowDataDocumentVideo(@NotNull gh ghVar, @NotNull byte[] videoBytes) {
        Intrinsics.checkNotNullParameter(ghVar, "<this>");
        Intrinsics.checkNotNullParameter(videoBytes, "videoBytes");
        VideoRecording videoRecordingQ = ghVar.q();
        if (videoRecordingQ == null) {
            return null;
        }
        URI url2 = videoRecordingQ.getUrl();
        if (url2 != null) {
            uc1.a(url2, videoBytes);
            return new WorkflowResults.IDV.DocumentVideo(new VideoRecording(url2, videoRecordingQ.getDuration(), videoRecordingQ.getLocation()));
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + url2 + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Document asWorkflowDataImage(@NotNull gh ghVar, String str, @NotNull String documentId, @NotNull String imageId) {
        Intrinsics.checkNotNullParameter(ghVar, "<this>");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        ArrayList arrayList = null;
        if (!ghVar.p()) {
            return null;
        }
        DocumentType documentTypeM = ghVar.m();
        if (documentTypeM == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeM + " must not be null."))).toString());
        }
        String strK = ghVar.k();
        if (strK == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strK) + " must not be null."))).toString());
        }
        Date dateE = ghVar.e();
        Date dateC = ghVar.c();
        List listD = ghVar.d();
        if (listD != null) {
            arrayList = new ArrayList();
            Iterator it8 = listD.iterator();
            while (it8.hasNext()) {
                WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = asWorkflowDataAttachment((eh) it8.next());
                if (attachmentAsWorkflowDataAttachment != null) {
                    arrayList.add(attachmentAsWorkflowDataAttachment);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null) {
            return new WorkflowResults.IDV.Document(documentTypeM, strK, dateE, str, dateC, arrayList2);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + arrayList2 + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.DeviceMetadata asWorkflowDataMetadata(@NotNull DeviceMetadata deviceMetadata, @NotNull String appTrackerId, String str) {
        Intrinsics.checkNotNullParameter(deviceMetadata, "<this>");
        Intrinsics.checkNotNullParameter(appTrackerId, "appTrackerId");
        List<DeviceMetaDataValidationError> listValidate = deviceMetadata.validate();
        boolean z = listValidate.size() == 1 && listValidate.contains(DeviceMetaDataValidationError.INVALID_LOCATION);
        if (listValidate.isEmpty() || z) {
            return new WorkflowResults.IDV.DeviceMetadata(deviceMetadata.getLanguage(), deviceMetadata.getRegion(), deviceMetadata.getModel(), deviceMetadata.getOsVersion(), deviceMetadata.getSdkVersion(), deviceMetadata.getOsCompromised(), appTrackerId, str);
        }
        return null;
    }

    public static final WorkflowResults.IDV.Nfc asWorkflowDataNfc(@NotNull ub0 ub0Var) {
        Intrinsics.checkNotNullParameter(ub0Var, "<this>");
        if (!ub0Var.i()) {
            return null;
        }
        String strE = ub0Var.e();
        if (strE != null) {
            return new WorkflowResults.IDV.Nfc(strE, ub0Var.c(), ub0Var.d(), ub0Var.h(), ub0Var.b(), ub0Var.a());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strE) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Person asWorkflowDataPerson(@NotNull xj0 xj0Var) {
        Intrinsics.checkNotNullParameter(xj0Var, "<this>");
        if (!xj0Var.b()) {
            return null;
        }
        String strA = xj0Var.a();
        if (strA == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
        }
        String strI = xj0Var.i();
        String strC = xj0Var.c();
        if (strC == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strC) + " must not be null."))).toString());
        }
        Gender genderF = xj0Var.f();
        if (genderF == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + genderF + " must not be null."))).toString());
        }
        String strO = xj0Var.o();
        if (strO == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strO) + " must not be null."))).toString());
        }
        String strN = xj0Var.n();
        String strQ = xj0Var.q();
        Date dateD = xj0Var.d();
        if (dateD != null) {
            return new WorkflowResults.IDV.Person(strA, strI, strC, genderF, strO, strN, strQ, dateD);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + dateD + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.SecondaryDocument asWorkflowDataSecondaryDocument(@NotNull xz0 xz0Var) {
        Intrinsics.checkNotNullParameter(xz0Var, "<this>");
        ArrayList arrayList = null;
        if (!xz0Var.f()) {
            return null;
        }
        DocumentType documentTypeD = xz0Var.d();
        if (documentTypeD == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + documentTypeD + " must not be null."))).toString());
        }
        Date dateC = xz0Var.c();
        Date dateA = xz0Var.a();
        List listB = xz0Var.b();
        if (listB != null) {
            arrayList = new ArrayList();
            Iterator it8 = listB.iterator();
            while (it8.hasNext()) {
                WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = asWorkflowDataAttachment((eh) it8.next());
                if (attachmentAsWorkflowDataAttachment != null) {
                    arrayList.add(attachmentAsWorkflowDataAttachment);
                }
            }
        }
        if (arrayList != null) {
            return new WorkflowResults.IDV.SecondaryDocument(documentTypeD, dateC, dateA, arrayList);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + arrayList + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Selfie asWorkflowDataSelfie(@NotNull b01 b01Var) {
        Intrinsics.checkNotNullParameter(b01Var, "<this>");
        if (!b01Var.f()) {
            return null;
        }
        Bitmap bitmapB = b01Var.b();
        if (bitmapB != null) {
            return new WorkflowResults.IDV.Selfie(bitmapB, b01Var.d(), b01Var.e());
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + bitmapB + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.SelfieVideo asWorkflowDataSelfieVideo(@NotNull b01 b01Var, @NotNull byte[] videoBytes) {
        Intrinsics.checkNotNullParameter(b01Var, "<this>");
        Intrinsics.checkNotNullParameter(videoBytes, "videoBytes");
        VideoRecording videoRecordingG = b01Var.g();
        if (videoRecordingG == null) {
            return null;
        }
        URI url2 = videoRecordingG.getUrl();
        if (url2 != null) {
            uc1.a(url2, videoBytes);
            return new WorkflowResults.IDV.SelfieVideo(new VideoRecording(url2, videoRecordingG.getDuration(), videoRecordingG.getLocation()));
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + url2 + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.TaxInfo asWorkflowDataTaxInfo(@NotNull l81 l81Var) {
        Intrinsics.checkNotNullParameter(l81Var, "<this>");
        if (!l81Var.b()) {
            return null;
        }
        String strE = l81Var.e();
        if (strE == null) {
            throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strE) + " must not be null."))).toString());
        }
        String strA = l81Var.a();
        if (strA != null) {
            return new WorkflowResults.IDV.TaxInfo(strE, strA, null, null, 12, null);
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strA) + " must not be null."))).toString());
    }

    public static final WorkflowResults.IDV.Geolocation asWorkflowGeolocation(@NotNull DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(deviceMetadata, "<this>");
        if (deviceMetadata.validate().contains(DeviceMetaDataValidationError.INVALID_LOCATION)) {
            return null;
        }
        return new WorkflowResults.IDV.Geolocation(Intrinsics.f(deviceMetadata.getLocation(), LocationProviderKt.getNotProvidedCoordinate()) ? null : deviceMetadata.getLocation());
    }
}
