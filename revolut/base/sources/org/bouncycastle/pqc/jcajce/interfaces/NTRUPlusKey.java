package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.NTRUPlusParameterSpec;

/* JADX INFO: loaded from: classes14.dex */
public interface NTRUPlusKey extends Key {
    NTRUPlusParameterSpec getParameterSpec();
}
