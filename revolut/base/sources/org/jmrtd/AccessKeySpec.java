package org.jmrtd;

import java.io.Serializable;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes14.dex */
public interface AccessKeySpec extends Serializable, KeySpec {
    String getAlgorithm();

    byte[] getKey();
}
