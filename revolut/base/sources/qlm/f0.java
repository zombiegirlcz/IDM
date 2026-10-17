package qlm;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes13.dex */
public interface f0 extends KSerializer {
    KSerializer[] childSerializers();

    default KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
