package com.fourthline.orca.internal;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class aa0 implements dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e00 f26736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f26737c;
    private final bh d;
    private final Map e;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f26740c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f26741g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f26742h;
        Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26743j;
        int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f26744l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f26746n;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f26744l = obj2;
            this.f26746n |= Integer.MIN_VALUE;
            return aa0.this.a((String) null, this);
        }
    }

    public aa0(String workflowId, e00 getDocumentAnalysisResultWorker, Function0 documentExpectations, bh validator) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(getDocumentAnalysisResultWorker, "getDocumentAnalysisResultWorker");
        Intrinsics.checkNotNullParameter(documentExpectations, "documentExpectations");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f26735a = workflowId;
        this.f26736b = getDocumentAnalysisResultWorker;
        this.f26737c = documentExpectations;
        this.d = validator;
        this.e = new LinkedHashMap();
    }

    @Override // com.fourthline.orca.internal.dg
    public void a(String documentId, Function1 onResults) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(onResults, "onResults");
        this.e.put(documentId, onResults);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.fourthline.orca.internal.dg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.aa0.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final md1 a(d00 d00Var) {
        kn documentRecognitionData = d00Var.getDocumentRecognitionData();
        String issuingCountry = documentRecognitionData != null ? documentRecognitionData.getIssuingCountry() : null;
        kn documentRecognitionData2 = d00Var.getDocumentRecognitionData();
        String documentType = documentRecognitionData2 != null ? documentRecognitionData2.getDocumentType() : null;
        kn documentRecognitionData3 = d00Var.getDocumentRecognitionData();
        pd1 pd1Var = new pd1(issuingCountry, documentType, documentRecognitionData3 != null ? documentRecognitionData3.getDocumentModel() : null, null, 8, null);
        gg0 ocrData = d00Var.getOcrData();
        String firstName = ocrData != null ? ocrData.getFirstName() : null;
        gg0 ocrData2 = d00Var.getOcrData();
        String lastName = ocrData2 != null ? ocrData2.getLastName() : null;
        gg0 ocrData3 = d00Var.getOcrData();
        String initials = ocrData3 != null ? ocrData3.getInitials() : null;
        gg0 ocrData4 = d00Var.getOcrData();
        String gender = ocrData4 != null ? ocrData4.getGender() : null;
        gg0 ocrData5 = d00Var.getOcrData();
        String nationality = ocrData5 != null ? ocrData5.getNationality() : null;
        gg0 ocrData6 = d00Var.getOcrData();
        String issuingCountry2 = ocrData6 != null ? ocrData6.getIssuingCountry() : null;
        gg0 ocrData7 = d00Var.getOcrData();
        Date issueDate = ocrData7 != null ? ocrData7.getIssueDate() : null;
        gg0 ocrData8 = d00Var.getOcrData();
        Date expirationDate = ocrData8 != null ? ocrData8.getExpirationDate() : null;
        gg0 ocrData9 = d00Var.getOcrData();
        Date dateOfBirth = ocrData9 != null ? ocrData9.getDateOfBirth() : null;
        gg0 ocrData10 = d00Var.getOcrData();
        String birthPlace = ocrData10 != null ? ocrData10.getBirthPlace() : null;
        gg0 ocrData11 = d00Var.getOcrData();
        String documentNumber = ocrData11 != null ? ocrData11.getDocumentNumber() : null;
        gg0 ocrData12 = d00Var.getOcrData();
        String documentType2 = ocrData12 != null ? ocrData12.getDocumentType() : null;
        gg0 ocrData13 = d00Var.getOcrData();
        return new md1(pd1Var, new od1(firstName, lastName, initials, gender, nationality, issuingCountry2, issueDate, expirationDate, dateOfBirth, birthPlace, documentNumber, documentType2, ocrData13 != null ? ocrData13.getTaxIdentificationNumber() : null));
    }
}
