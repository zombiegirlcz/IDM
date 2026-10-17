package q4j;

import kotlin.jvm.internal.Intrinsics;
import nd.k;
import nd.l;
import ogm.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldd.b f242172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f242173b;

    public a(s4j.a backendFieldIdGenerator, ldd.b focusRequesterDelegate, b inputDefinitionMappingUtils, i inputDefinitionLabelMapper, l inputDefinitionPlaceholderMapper, k inputDefinitionMainImageMapper) {
        Intrinsics.checkNotNullParameter(backendFieldIdGenerator, "backendFieldIdGenerator");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(inputDefinitionMappingUtils, "inputDefinitionMappingUtils");
        Intrinsics.checkNotNullParameter(inputDefinitionLabelMapper, "inputDefinitionLabelMapper");
        Intrinsics.checkNotNullParameter(inputDefinitionPlaceholderMapper, "inputDefinitionPlaceholderMapper");
        Intrinsics.checkNotNullParameter(inputDefinitionMainImageMapper, "inputDefinitionMainImageMapper");
        this.f242172a = focusRequesterDelegate;
        this.f242173b = inputDefinitionLabelMapper;
    }
}
