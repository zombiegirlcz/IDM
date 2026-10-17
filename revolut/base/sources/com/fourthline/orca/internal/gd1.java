package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gd1 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28855c;
    private final int d;
    private final Map e;

    public gd1(String source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f28854b = source;
        this.f28855c = i;
        this.d = i2;
        this.e = zhm.r0.k(new Pair("source", source), new Pair("index", Integer.valueOf(i)), new Pair("total", Integer.valueOf(i2)));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gd1)) {
            return false;
        }
        gd1 gd1Var = (gd1) obj2;
        return Intrinsics.f(this.f28854b, gd1Var.f28854b) && this.f28855c == gd1Var.f28855c && this.d == gd1Var.d;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "scroll_page_changed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/scroll_page_changed/jsonschema/1-0-0";
    }

    public int hashCode() {
        return (((this.f28854b.hashCode() * 31) + Integer.hashCode(this.f28855c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ScrollPageChanged(source=" + this.f28854b + ", currentPage=" + this.f28855c + ", totalPages=" + this.d + ")";
    }
}
