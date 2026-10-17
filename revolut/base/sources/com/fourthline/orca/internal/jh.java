package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.internal.tg;
import com.fourthline.orca.workflow.DocumentComponentResult;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.orca.workflow.WorkflowResultsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class jh {
    public Object a(Object obj2) {
        Throwable unexpected;
        gg0 gg0VarC;
        Throwable thA = yhm.m.a(obj2);
        if (thA != null) {
            if (thA instanceof si.e) {
                unexpected = hh0.b(((si.e) thA).a());
            } else if (thA instanceof si.a) {
                unexpected = hh0.b(((si.a) thA).a());
            } else if (thA instanceof si.c) {
                unexpected = WorkflowError.Canceled.INSTANCE;
            } else if (thA instanceof si.g) {
                unexpected = new WorkflowError.Unexpected(((si.g) thA).getMessage());
            } else {
                if ((thA instanceof si.d) || (thA instanceof si.f)) {
                    throw new IllegalStateException((this + " can not be a public error!").toString());
                }
                String message = thA.getMessage();
                if (message == null) {
                    message = thA instanceof kh0 ? ((kh0) thA).getAlias() : thA.getClass().getSimpleName();
                }
                Intrinsics.h(message);
                unexpected = new WorkflowError.Unexpected(message);
            }
            return yhm.o.a(unexpected);
        }
        ym ymVar = (ym) obj2;
        VideoRecording videoRecording = ymVar.b().getVideoRecording();
        MrzInfo mrzInfo = ymVar.b().getMrzInfo();
        DocumentType documentType = ymVar.b().getDocumentType();
        List listA = go.a(ymVar.b().getStepResults());
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            WorkflowResults.IDV.Attachment attachmentAsWorkflowDataAttachment = WorkflowResultsKt.asWorkflowDataAttachment((eh) it8.next());
            if (attachmentAsWorkflowDataAttachment != null) {
                arrayList.add(attachmentAsWorkflowDataAttachment);
            }
        }
        WorkflowResults.Component.Document document = new WorkflowResults.Component.Document(videoRecording, mrzInfo, documentType, arrayList);
        tg.a aVarA = ymVar.a();
        WorkflowResults.Component.DocumentAnalysis documentAnalysis = null;
        documentAnalysis = null;
        if (aVarA != null && (gg0VarC = aVarA.c()) != null) {
            String initials = gg0VarC.getInitials();
            String firstName = gg0VarC.getFirstName();
            String lastName = gg0VarC.getLastName();
            Gender genderA = hj.a(gg0VarC);
            String birthPlace = gg0VarC.getBirthPlace();
            Date dateOfBirth = gg0VarC.getDateOfBirth();
            String nationality = gg0VarC.getNationality();
            String taxIdentificationNumber = gg0VarC.getTaxIdentificationNumber();
            Date issueDate = gg0VarC.getIssueDate();
            String issuingCountry = gg0VarC.getIssuingCountry();
            String documentType2 = gg0VarC.getDocumentType();
            documentAnalysis = new WorkflowResults.Component.DocumentAnalysis(firstName, lastName, initials, genderA, nationality, issuingCountry, issueDate, gg0VarC.getExpirationDate(), dateOfBirth, birthPlace, gg0VarC.getDocumentNumber(), documentType2 != null ? CountryNetworkModelKt.toDocumentType$default(documentType2, null, 1, null) : null, null, taxIdentificationNumber, 4096, null);
        }
        DocumentComponentResult documentComponentResult = new DocumentComponentResult(document, documentAnalysis);
        m.Companion companion = yhm.m.INSTANCE;
        return documentComponentResult;
    }
}
