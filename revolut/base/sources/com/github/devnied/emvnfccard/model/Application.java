package com.github.devnied.emvnfccard.model;

import com.github.devnied.emvnfccard.model.enums.ApplicationStepEnum;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class Application extends AbstractData implements Comparable<Application> {
    private static final long serialVersionUID = 2917341864815087679L;

    /* JADX INFO: renamed from: aid, reason: collision with root package name */
    private byte[] f37246aid;
    private String applicationLabel;
    private List<EmvTransactionRecord> listTransactions;
    private ApplicationStepEnum readingStep = ApplicationStepEnum.NOT_SELECTED;
    private int transactionCounter = -1;
    private int leftPinTry = -1;
    private int priority = 1;
    private float amount = -1.0f;

    public byte[] getAid() {
        return this.f37246aid;
    }

    public float getAmount() {
        return this.amount;
    }

    public String getApplicationLabel() {
        return this.applicationLabel;
    }

    public int getLeftPinTry() {
        return this.leftPinTry;
    }

    public List<EmvTransactionRecord> getListTransactions() {
        return this.listTransactions;
    }

    public int getPriority() {
        return this.priority;
    }

    public ApplicationStepEnum getReadingStep() {
        return this.readingStep;
    }

    public int getTransactionCounter() {
        return this.transactionCounter;
    }

    public void setAid(byte[] bArr) {
        if (bArr != null) {
            this.f37246aid = bArr;
        }
    }

    public void setAmount(float f) {
        this.amount = f;
    }

    public void setApplicationLabel(String str) {
        this.applicationLabel = str;
    }

    public void setLeftPinTry(int i) {
        this.leftPinTry = i;
    }

    public void setListTransactions(List<EmvTransactionRecord> list) {
        this.listTransactions = list;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setReadingStep(ApplicationStepEnum applicationStepEnum) {
        this.readingStep = applicationStepEnum;
    }

    public void setTransactionCounter(int i) {
        this.transactionCounter = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(Application application) {
        return this.priority - application.getPriority();
    }
}
