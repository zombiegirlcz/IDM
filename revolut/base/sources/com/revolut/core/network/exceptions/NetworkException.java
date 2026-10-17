package com.revolut.core.network.exceptions;

import d0m.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import tj0.c;
import ulm.x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00060\u0001j\u0002`\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/network/exceptions/NetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "a", "core_network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f51448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51450c;
    public final String d;
    public final boolean e;
    public final c f;

    /* JADX INFO: renamed from: com.revolut.core.network.exceptions.NetworkException$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final String a(Companion companion, int i, String str, boolean z) {
            companion.getClass();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("HTTP code: " + i + ", ");
            Regex regex = b.f110450a;
            sb6.append("Request URL: " + b.a(str.toString()) + ", ");
            StringBuilder sb9 = new StringBuilder("Is authorised: ");
            sb9.append(z);
            sb6.append(sb9.toString());
            return sb6.toString();
        }

        public Companion(int i) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkException(x0 url2, int i, String httpMethod, String str, boolean z, c cVar) {
        super(Companion.a(INSTANCE, i, url2.i, z));
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.f51448a = url2;
        this.f51449b = i;
        this.f51450c = httpMethod;
        this.d = str;
        this.e = z;
        this.f = cVar;
    }
}
