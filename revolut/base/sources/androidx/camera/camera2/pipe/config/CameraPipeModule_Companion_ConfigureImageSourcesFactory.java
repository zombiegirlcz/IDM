package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.media.ImageReaderImageSources;
import androidx.camera.camera2.pipe.media.ImageSources;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ConfigureImageSourcesFactory implements e {
    public static ImageSources configureImageSources(ImageReaderImageSources imageReaderImageSources, CameraPipe.Config config) {
        ImageSources imageSourcesConfigureImageSources = CameraPipeModule.INSTANCE.configureImageSources(imageReaderImageSources, config);
        s.k(imageSourcesConfigureImageSources);
        return imageSourcesConfigureImageSources;
    }
}
