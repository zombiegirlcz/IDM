package com.fourthline.core.internal;

import com.fourthline.core.mrz.IdlDutchInfoExtensionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class j extends b {
    public static final a d = new a(null);
    private static final Regex e = new Regex("([A-Z0-9<!|blqgi])+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26359c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String mrzString) {
        super(mrzString);
        Intrinsics.checkNotNullParameter(mrzString, "mrzString");
        this.f26359c = mrzString;
    }

    private final boolean e(String str) {
        return str.length() >= 6 && kotlin.text.a0.H(IdlDutchInfoExtensionsKt.getCleanNLIDLPrefix(str), IdlDutchInfoExtensionsKt.NL_IDL_PREFIX, true);
    }

    @Override // com.fourthline.core.internal.b
    public String a() {
        return this.f26359c;
    }

    @Override // com.fourthline.core.internal.b
    public boolean b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() == 30;
    }

    @Override // com.fourthline.core.internal.b
    public boolean c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() != 0 && d(str).size() == 1;
    }

    @Override // com.fourthline.core.internal.b
    public boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return e.f(str) && e(str);
    }
}
