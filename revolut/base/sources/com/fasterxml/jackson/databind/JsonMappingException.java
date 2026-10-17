package com.fasterxml.jackson.databind;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.i;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.dataformat.cbor.e;
import f9.c;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;
import k9.g;
import x9.f;

/* JADX INFO: loaded from: classes16.dex */
public class JsonMappingException extends DatabindException {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList f26185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Closeable f26186c;

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.f26186c = closeable;
        if (closeable instanceof l) {
            e eVar = (e) ((l) closeable);
            c cVar = (c) eVar.d.f132797c;
            long j2 = eVar.i;
            this.f26158a = new i(cVar, j2, -1L, (int) j2);
        }
    }

    public static JsonMappingException d(Throwable th10, g gVar) {
        JsonMappingException jsonMappingException;
        Object objB;
        if (th10 instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th10;
        } else {
            String strG = f.g(th10);
            if (strG == null || strG.isEmpty()) {
                strG = "(was " + th10.getClass().getName() + ")";
            }
            jsonMappingException = new JsonMappingException((!(th10 instanceof JacksonException) || (objB = ((JacksonException) th10).b()) == null) ? null : (Closeable) objB, strG, th10);
        }
        if (jsonMappingException.f26185b == null) {
            jsonMappingException.f26185b = new LinkedList();
        }
        if (jsonMappingException.f26185b.size() < 1000) {
            jsonMappingException.f26185b.addFirst(gVar);
        }
        return jsonMappingException;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final Object b() {
        return this.f26186c;
    }

    public final String c() {
        String message = super.getMessage();
        if (this.f26185b == null) {
            return message;
        }
        StringBuilder sb6 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb6.append(" (through reference chain: ");
        LinkedList linkedList = this.f26185b;
        if (linkedList != null) {
            Iterator it8 = linkedList.iterator();
            while (it8.hasNext()) {
                sb6.append(((g) it8.next()).toString());
                if (it8.hasNext()) {
                    sb6.append("->");
                }
            }
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return c();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String getMessage() {
        return c();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + c();
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th10) {
        super(str, null, th10);
        this.f26186c = closeable;
        if (th10 instanceof JacksonException) {
            this.f26158a = ((JsonProcessingException) ((JacksonException) th10)).f26158a;
        } else if (closeable instanceof l) {
            e eVar = (e) ((l) closeable);
            c cVar = (c) eVar.d.f132797c;
            long j2 = eVar.i;
            this.f26158a = new i(cVar, j2, -1L, (int) j2);
        }
    }
}
