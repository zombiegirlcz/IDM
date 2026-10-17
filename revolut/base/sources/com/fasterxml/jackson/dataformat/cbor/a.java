package com.fasterxml.jackson.dataformat.cbor;

import com.youTransactor.uCube.rpc.Constants;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f26196a;

    static {
        int[] iArr = new int[256];
        for (int i = 128; i < 256; i++) {
            iArr[i] = (i & BERTags.FLAGS) == 192 ? 1 : (i & 240) == 224 ? 2 : (i & Constants.TAG_FULL_SVPP_IDENTIFICATION) == 240 ? 3 : -1;
        }
        f26196a = iArr;
    }
}
