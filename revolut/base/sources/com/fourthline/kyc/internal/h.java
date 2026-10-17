package com.fourthline.kyc.internal;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes23.dex */
public class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26557a;

    public h(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f26557a = text;
    }

    private final boolean a() {
        return !d0.W(d0.G0(this.f26557a, '\n', '\r'));
    }

    private final String b() {
        return b.a(this.f26557a);
    }

    @Override // com.fourthline.kyc.internal.a
    public void a(Appendable builder, String indent) throws IOException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(indent, "indent");
        if (a()) {
            builder.append(indent + b() + System.lineSeparator());
        }
    }

    public final Appendable a(Appendable builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.append(b());
    }
}
