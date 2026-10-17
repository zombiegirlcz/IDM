package com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto;

import c66.j;
import com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f71861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f71862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f71863c;
    public final j d;
    public final d e;

    public g(e hpkeRecipient, c mnemonic, b evmDeriver, j solanaDeriver, d addressVerifier) {
        Intrinsics.checkNotNullParameter(hpkeRecipient, "hpkeRecipient");
        Intrinsics.checkNotNullParameter(mnemonic, "mnemonic");
        Intrinsics.checkNotNullParameter(evmDeriver, "evmDeriver");
        Intrinsics.checkNotNullParameter(solanaDeriver, "solanaDeriver");
        Intrinsics.checkNotNullParameter(addressVerifier, "addressVerifier");
        this.f71861a = hpkeRecipient;
        this.f71862b = mnemonic;
        this.f71863c = evmDeriver;
        this.d = solanaDeriver;
        this.e = addressVerifier;
    }

    public static final byte[] a(g gVar, String str) {
        Object objA;
        gVar.getClass();
        try {
            m.Companion companion = m.INSTANCE;
            for (int i = 0; i < str.length(); i++) {
                if (CharsKt.e(str.charAt(i))) {
                    throw new IllegalArgumentException();
                }
            }
            objA = Base64.getDecoder().decode(str);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (m.a(objA) != null) {
            throw new SeedPhraseExportDecryptionException.InvalidResponse();
        }
        Intrinsics.checkNotNullExpressionValue(objA, "getOrElse(...)");
        return (byte[]) objA;
    }
}
