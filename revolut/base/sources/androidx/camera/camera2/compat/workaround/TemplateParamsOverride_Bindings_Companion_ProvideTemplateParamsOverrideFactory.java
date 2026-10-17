package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory implements e {
    public static TemplateParamsOverride provideTemplateParamsOverride(CameraQuirks cameraQuirks) {
        TemplateParamsOverride templateParamsOverrideProvideTemplateParamsOverride = TemplateParamsOverride.Bindings.INSTANCE.provideTemplateParamsOverride(cameraQuirks);
        s.k(templateParamsOverrideProvideTemplateParamsOverride);
        return templateParamsOverrideProvideTemplateParamsOverride;
    }
}
