package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSideKt;
import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.core.location.Coordinate;
import com.fourthline.nfc.NfcAuthenticationChecks;
import com.fourthline.orca.internal.ab0;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.orca.workflow.WorkflowResultsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes23.dex */
public abstract class qc1 {
    public static final Pair a(gh ghVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(ghVar, "<this>");
        WorkflowResults.IDV.Document documentAsWorkflowDataDocument = WorkflowResultsKt.asWorkflowDataDocument(ghVar, str2);
        if (documentAsWorkflowDataDocument == null) {
            return null;
        }
        ub0 ub0VarH = ghVar.h();
        return new Pair(documentAsWorkflowDataDocument, a(documentAsWorkflowDataDocument, str, ub0VarH != null ? WorkflowResultsKt.asWorkflowDataNfc(ub0VarH) : null, "document", false));
    }

    public static final Pair b(gh ghVar) {
        WorkflowResults.IDV.Nfc nfcAsWorkflowDataNfc;
        Intrinsics.checkNotNullParameter(ghVar, "<this>");
        ub0 ub0VarH = ghVar.h();
        if (ub0VarH == null || (nfcAsWorkflowDataNfc = WorkflowResultsKt.asWorkflowDataNfc(ub0VarH)) == null) {
            return null;
        }
        mx mxVarA = a("EmbeddedFace", null, null, null, ghVar.k(), "embeddedFace.jpeg", nfcAsWorkflowDataNfc.getLocation(), 14, null);
        Json jsonA = s40.a();
        jsonA.getClass();
        return new Pair(nfcAsWorkflowDataNfc, zhm.v.k(new ab0.c.a("UploadDocumentRequest", tc.a(jsonA.c(mx.INSTANCE.serializer(), mxVarA)), null, 4, null), a(ghVar)));
    }

    public static final Pair a(gh ghVar, byte[] videoBytes) {
        Intrinsics.checkNotNullParameter(ghVar, "<this>");
        Intrinsics.checkNotNullParameter(videoBytes, "videoBytes");
        WorkflowResults.IDV.DocumentVideo documentVideoAsWorkflowDataDocumentVideo = WorkflowResultsKt.asWorkflowDataDocumentVideo(ghVar, videoBytes);
        if (documentVideoAsWorkflowDataDocumentVideo == null) {
            return null;
        }
        mx mxVarA = a("DocumentVideo", null, null, Boolean.TRUE, null, "documentvideo.mp4", documentVideoAsWorkflowDataDocumentVideo.getRecording().getLocation(), 22, null);
        Json jsonA = s40.a();
        jsonA.getClass();
        return new Pair(documentVideoAsWorkflowDataDocumentVideo, zhm.v.k(new ab0.c.a("UploadDocumentRequest", tc.a(jsonA.c(mx.INSTANCE.serializer(), mxVarA)), null, 4, null), a(videoBytes, "documentvideo.mp4")));
    }

    public static final Pair a(yz0 yz0Var, DocumentType type) {
        Object next;
        WorkflowResults.IDV.SecondaryDocument secondaryDocumentAsWorkflowDataSecondaryDocument;
        Intrinsics.checkNotNullParameter(yz0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it8 = yz0Var.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((xz0) next).d() == type) {
                break;
            }
        }
        xz0 xz0Var = (xz0) next;
        if (xz0Var == null || (secondaryDocumentAsWorkflowDataSecondaryDocument = WorkflowResultsKt.asWorkflowDataSecondaryDocument(xz0Var)) == null) {
            return null;
        }
        String lowerCase = type.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        br brVarA = a(secondaryDocumentAsWorkflowDataSecondaryDocument, lowerCase);
        Json jsonA = s40.a();
        jsonA.getClass();
        return new Pair(secondaryDocumentAsWorkflowDataSecondaryDocument, zhm.d0.E0(a(secondaryDocumentAsWorkflowDataSecondaryDocument.getImages(), lowerCase, 0.0d, 2, (Object) null), zhm.u.c(new ab0.c.a("UploadDocumentRequest", tc.a(jsonA.c(br.INSTANCE.serializer(), brVarA)), null, 4, null))));
    }

    public static final Pair a(b01 b01Var) {
        Intrinsics.checkNotNullParameter(b01Var, "<this>");
        WorkflowResults.IDV.Selfie selfieAsWorkflowDataSelfie = WorkflowResultsKt.asWorkflowDataSelfie(b01Var);
        if (selfieAsWorkflowDataSelfie == null) {
            return null;
        }
        mx mxVarA = a("Selfie", null, null, null, null, "selfie.jpeg", selfieAsWorkflowDataSelfie.getLocation(), 30, null);
        Json jsonA = s40.a();
        jsonA.getClass();
        return new Pair(selfieAsWorkflowDataSelfie, zhm.v.k(new ab0.c.a("UploadDocumentRequest", tc.a(jsonA.c(mx.INSTANCE.serializer(), mxVarA)), null, 4, null), a(selfieAsWorkflowDataSelfie)));
    }

    public static final Pair a(b01 b01Var, byte[] videoBytes) {
        Intrinsics.checkNotNullParameter(b01Var, "<this>");
        Intrinsics.checkNotNullParameter(videoBytes, "videoBytes");
        WorkflowResults.IDV.SelfieVideo selfieVideoAsWorkflowDataSelfieVideo = WorkflowResultsKt.asWorkflowDataSelfieVideo(b01Var, videoBytes);
        if (selfieVideoAsWorkflowDataSelfieVideo == null) {
            return null;
        }
        mx mxVarA = a("SelfieVideo", null, null, null, null, "selfievideo.mp4", selfieVideoAsWorkflowDataSelfieVideo.getRecording().getLocation(), 30, null);
        Json jsonA = s40.a();
        jsonA.getClass();
        return new Pair(selfieVideoAsWorkflowDataSelfieVideo, zhm.v.k(new ab0.c.a("UploadDocumentRequest", tc.a(jsonA.c(mx.INSTANCE.serializer(), mxVarA)), null, 4, null), a(videoBytes, "selfievideo.mp4")));
    }

    public static /* synthetic */ List a(List list, String str, double d, int i, Object obj2) {
        if ((i & 2) != 0) {
            d = 1.0d;
        }
        return a(list, str, d);
    }

    private static final List a(List list, String str, double d) throws IOException {
        zhm.q qVarK1 = zhm.d0.k1(list);
        ArrayList arrayList = new ArrayList(zhm.w.t(qVarK1, 10));
        Iterator it8 = qVarK1.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                return arrayList;
            }
            IndexedValue indexedValue = (IndexedValue) dVar.next();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ((WorkflowResults.IDV.Attachment) indexedValue.f186392b).getImage().compress(Bitmap.CompressFormat.JPEG, (int) (((double) 100) * d), byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                ab0.c.a aVar = new ab0.c.a("Files", new sc(byteArray), bx.a(bx.d(), str + indexedValue.f186391a + ".jpeg"));
                byteArrayOutputStream.close();
                arrayList.add(aVar);
            } finally {
            }
        }
    }

    private static final ab0.c.a a(byte[] bArr, String str) {
        return new ab0.c.a("Files", new sc(bArr), bx.a(bx.f(), str));
    }

    private static final ab0.c.a a(WorkflowResults.IDV.Selfie selfie) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            selfie.getImage().compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            ab0.c.a aVar = new ab0.c.a("Files", new sc(byteArray), bx.a(bx.d(), "selfie.jpeg"));
            byteArrayOutputStream.close();
            return aVar;
        } finally {
        }
    }

    private static final ab0.c.a a(gh ghVar) throws IOException {
        Bitmap bitmapC;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ub0 ub0VarH = ghVar.h();
            if (ub0VarH != null && (bitmapC = ub0VarH.c()) != null) {
                bitmapC.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            ab0.c.a aVar = new ab0.c.a("Files", new sc(byteArray), bx.a(bx.d(), "embeddedFace.jpeg"));
            byteArrayOutputStream.close();
            return aVar;
        } finally {
        }
    }

    private static final br a(WorkflowResults.IDV.Document document, String str, WorkflowResults.IDV.Nfc nfc2, String str2, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Map<Integer, byte[]> dataGroups;
        Set<Map.Entry<Integer, byte[]>> setEntrySet;
        String fourthlineValue = DocumentTypeKt.toFourthlineValue(document.getType());
        String number = document.getNumber();
        String str3 = !z ? str : null;
        Date expirationDate = document.getExpirationDate();
        Date issueDate = document.getIssueDate();
        String issuingCountry = document.getIssuingCountry();
        if (z) {
            List<WorkflowResults.IDV.Attachment> images = document.getImages();
            ArrayList arrayList3 = new ArrayList(zhm.w.t(images, 10));
            int i = 0;
            for (Object obj2 : images) {
                int i2 = i + 1;
                if (i >= 0) {
                    WorkflowResults.IDV.Attachment attachment = (WorkflowResults.IDV.Attachment) obj2;
                    String str4 = str2 + i + ".jpeg";
                    String fourthlineValue2 = DocumentFileSideKt.toFourthlineValue(attachment.getFileSide());
                    String strA = a(attachment.isAngled());
                    Coordinate location = attachment.getLocation();
                    String strValueOf = location != null ? String.valueOf(location.getLatitude()) : null;
                    Coordinate location2 = attachment.getLocation();
                    arrayList3.add(new d50(str4, fourthlineValue2, strA, strValueOf, location2 != null ? String.valueOf(location2.getLongitude()) : null, (String) null, (String) null, 96, (DefaultConstructorMarker) null));
                    i = i2;
                } else {
                    zhm.v.s();
                    throw null;
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (nfc2 == null || (dataGroups = nfc2.getDataGroups()) == null || (setEntrySet = dataGroups.entrySet()) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList4 = new ArrayList(zhm.w.t(setEntrySet, 10));
            Iterator<T> it8 = setEntrySet.iterator();
            while (it8.hasNext()) {
                Map.Entry entry = (Map.Entry) it8.next();
                arrayList4.add(new ed0(String.valueOf(((Number) entry.getKey()).intValue()), ExtensionsKt.toHex((byte[]) entry.getValue())));
            }
            arrayList2 = arrayList4;
        }
        return new br(fourthlineValue, true, false, number, str3, expirationDate, issueDate, issuingCountry, arrayList, arrayList2, nfc2 != null ? nfc2.getAuthenticationChecks() : null);
    }

    private static final br a(WorkflowResults.IDV.SecondaryDocument secondaryDocument, String str) {
        String fourthlineValue = DocumentTypeKt.toFourthlineValue(secondaryDocument.getType());
        Date expirationDate = secondaryDocument.getExpirationDate();
        Date issueDate = secondaryDocument.getIssueDate();
        List<WorkflowResults.IDV.Attachment> images = secondaryDocument.getImages();
        ArrayList arrayList = new ArrayList(zhm.w.t(images, 10));
        int i = 0;
        for (Object obj2 : images) {
            int i2 = i + 1;
            String strValueOf = null;
            if (i >= 0) {
                WorkflowResults.IDV.Attachment attachment = (WorkflowResults.IDV.Attachment) obj2;
                String str2 = str + i + ".jpeg";
                String fourthlineValue2 = DocumentFileSideKt.toFourthlineValue(attachment.getFileSide());
                String strA = a(attachment.isAngled());
                Coordinate location = attachment.getLocation();
                String strValueOf2 = location != null ? String.valueOf(location.getLatitude()) : null;
                Coordinate location2 = attachment.getLocation();
                if (location2 != null) {
                    strValueOf = String.valueOf(location2.getLongitude());
                }
                arrayList.add(new d50(str2, fourthlineValue2, strA, strValueOf2, strValueOf, (String) null, (String) null, 96, (DefaultConstructorMarker) null));
                i = i2;
            } else {
                zhm.v.s();
                throw null;
            }
        }
        return new br(fourthlineValue, false, false, (String) null, (String) null, expirationDate, issueDate, (String) null, (List) arrayList, (List) null, (NfcAuthenticationChecks) null, 1688, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ mx a(String str, Date date, String str2, Boolean bool, String str3, String str4, Coordinate coordinate, int i, Object obj2) {
        if ((i & 2) != 0) {
            date = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return a(str, date, str2, bool, str3, str4, coordinate);
    }

    private static final mx a(String str, Date date, String str2, Boolean bool, String str3, String str4, Coordinate coordinate) {
        return new mx(str, bool, false, date, str2, str3, zhm.u.c(new d50(str4, (String) null, (String) null, coordinate != null ? String.valueOf(coordinate.getLatitude()) : null, coordinate != null ? String.valueOf(coordinate.getLongitude()) : null, (String) null, (String) null, 102, (DefaultConstructorMarker) null)));
    }

    public static final String a(boolean z) {
        return z ? "Tilted" : "Normal";
    }
}
