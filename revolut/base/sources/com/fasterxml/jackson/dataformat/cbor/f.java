package com.fasterxml.jackson.dataformat.cbor;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.i;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import java.io.Closeable;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends m {
    public final f d;
    public final twg.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f26212h = null;

    public f(f fVar, twg.c cVar, int i, int i2) {
        this.d = fVar;
        this.e = cVar;
        this.f26179b = i;
        this.f = i2;
        this.f26180c = -1;
    }

    @Override // com.fasterxml.jackson.core.m
    public final String a() {
        return this.f26211g;
    }

    public final boolean e() {
        int i = this.f26180c + 1;
        this.f26180c = i;
        return i != this.f;
    }

    public final void f(String str) {
        i iVar;
        this.f26211g = str;
        twg.c cVar = this.e;
        if (cVar == null || !cVar.D(str)) {
            return;
        }
        String strP = p.a.p("Duplicate field '", str, "'");
        Closeable closeable = (Closeable) cVar.f275017a;
        if (closeable instanceof l) {
            e eVar = (e) ((l) closeable);
            long j2 = eVar.f26198h + ((long) eVar.f);
            iVar = new i((f9.c) eVar.d.f132797c, j2, -1L, (int) j2);
        } else {
            iVar = null;
        }
        JsonParseException jsonParseException = new JsonParseException(strP, iVar, null);
        jsonParseException.f26171b = null;
        throw jsonParseException;
    }

    @Override // com.fasterxml.jackson.core.m
    public final String toString() {
        StringBuilder sb6 = new StringBuilder(64);
        int i = this.f26179b;
        if (i == 0) {
            sb6.append("/");
        } else if (i == 1) {
            sb6.append('[');
            int i2 = this.f26180c;
            if (i2 < 0) {
                i2 = 0;
            }
            sb6.append(i2);
            sb6.append(']');
        } else if (i == 2) {
            sb6.append(CoreConstants.CURLY_LEFT);
            if (this.f26211g != null) {
                sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                f9.b.a(this.f26211g, sb6);
                sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else {
                sb6.append('?');
            }
            sb6.append(CoreConstants.CURLY_RIGHT);
        }
        return sb6.toString();
    }
}
