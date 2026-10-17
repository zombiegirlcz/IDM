package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes16.dex */
public abstract class JsonProcessingException extends JacksonException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f26158a;

    public JsonProcessingException(String str, i iVar, Throwable th10) {
        super(str, th10);
        this.f26158a = iVar;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final String a() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        i iVar = this.f26158a;
        if (iVar == null) {
            return message;
        }
        StringBuilder sb6 = new StringBuilder(100);
        sb6.append(message);
        if (iVar != null) {
            sb6.append("\n at ");
            sb6.append(iVar.toString());
        }
        return sb6.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
