package am0;

import afa.q;
import ai0.j;
import aik.d;
import cn0.g;
import efm.d0;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.Charsets;
import mm0.n;
import mm0.o;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import zm0.c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements mg0.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f6282c = Charsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f6284b;

    public b(c sessionProvider, bm0.a cryptoWrapper, tl0.a base64) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f6283a = sessionProvider;
        this.f6284b = base64;
    }

    public final i a(String value) {
        d0 d0VarL;
        Intrinsics.checkNotNullParameter(value, "value");
        o oVarD = ((g) this.f6283a).d();
        if (oVarD instanceof n) {
            d0VarL = d0.m(((n) oVarD).f207115b.f207121b);
            Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
        } else {
            d0VarL = d0.l(new IllegalStateException(j6.a.q("Value can not be encrypted or decrypted when session is not authorised. Current session is ", o0.f186429a.b(oVarD.getClass()).m())));
            Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
        }
        i iVar = new i(new i(new i(new i(d0VarL, new j(new d(26), 7), 1), new j(new ak7.g(this, value), 8), 1), new j(new q(this, 25), 9), 1), new j(new d(27), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
