package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory implements e {
    public static SystemClockOffsets provideSystemClockOffsets() {
        SystemClockOffsets systemClockOffsetsProvideSystemClockOffsets = SharedCameraGraphModules.INSTANCE.provideSystemClockOffsets();
        s.k(systemClockOffsetsProvideSystemClockOffsets);
        return systemClockOffsetsProvideSystemClockOffsets;
    }
}
