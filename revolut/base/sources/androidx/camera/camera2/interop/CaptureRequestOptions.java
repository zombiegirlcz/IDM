package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfigKt;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;
import defpackage.e1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/interop/CaptureRequestOptions;", "Landroidx/camera/core/impl/ReadableConfig;", "Landroidx/camera/core/impl/Config;", "config", "", "unused", "<init>", "(Landroidx/camera/core/impl/Config;Z)V", "(Landroidx/camera/core/impl/Config;)V", "getConfig", "()Landroidx/camera/core/impl/Config;", "Landroidx/camera/core/impl/Config;", "Builder", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CaptureRequestOptions implements ReadableConfig {

    @NotNull
    private final Config config;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;", "Landroidx/camera/core/ExtendableBuilder;", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "<init>", "()V", "Landroidx/camera/core/impl/MutableConfig;", "getMutableConfig", "()Landroidx/camera/core/impl/MutableConfig;", "ValueT", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", "value", "setCaptureRequestOption", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;", "build", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "Landroidx/camera/core/impl/MutableOptionsBundle;", "mutableOptionsBundle", "Landroidx/camera/core/impl/MutableOptionsBundle;", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder implements ExtendableBuilder<CaptureRequestOptions> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final MutableOptionsBundle mutableOptionsBundle;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder$Companion;", "", "<init>", "()V", "from", "Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;", "config", "Landroidx/camera/core/impl/Config;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean from$lambda$0(Builder builder, Config config, Config.Option it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                builder.getMutableConfig().insertOption(it8, config.getOptionPriority(it8), config.retrieveOption(it8));
                return true;
            }

            @NotNull
            public final Builder from(@NotNull Config config) {
                Intrinsics.checkNotNullParameter(config, "config");
                Builder builder = new Builder();
                config.findOptions("camera2.captureRequest.option.", new e1(builder, config, 4));
                return builder;
            }

            private Companion() {
            }
        }

        public Builder() {
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            Intrinsics.checkNotNullExpressionValue(mutableOptionsBundleCreate, "create(...)");
            this.mutableOptionsBundle = mutableOptionsBundleCreate;
        }

        @NotNull
        public CaptureRequestOptions build() {
            OptionsBundle optionsBundleFrom = OptionsBundle.from(this.mutableOptionsBundle);
            Intrinsics.checkNotNullExpressionValue(optionsBundleFrom, "from(...)");
            return new CaptureRequestOptions(optionsBundleFrom);
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NotNull
        public MutableConfig getMutableConfig() {
            return this.mutableOptionsBundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <ValueT> Builder setCaptureRequestOption(@NotNull CaptureRequest.Key<ValueT> key, ValueT value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mutableOptionsBundle.insertOption(Camera2ImplConfigKt.createCaptureRequestOption(key), value);
            return this;
        }
    }

    private CaptureRequestOptions(Config config, boolean z) {
        this.config = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NotNull
    public Config getConfig() {
        return this.config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureRequestOptions(@NotNull Config config) {
        this(config, false);
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
