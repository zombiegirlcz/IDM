package hl7;

import java.util.List;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u4<T> {

    @NotNull
    public static final t4 Companion = new t4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PluginGeneratedSerialDescriptor f153328b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153329a;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.ItemsHolderDto", null, 1);
        pluginGeneratedSerialDescriptor.j("items", false);
        f153328b = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ u4(int i, List list) {
        if (1 == (i & 1)) {
            this.f153329a = list;
        } else {
            qlm.j1.f(f153328b, i, 1);
            throw null;
        }
    }
}
