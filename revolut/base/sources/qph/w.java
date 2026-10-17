package qph;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends atc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hph.j f248427b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f01.c uiKitResources, hph.j resourceMapper) {
        super(uiKitResources);
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(resourceMapper, "resourceMapper");
        this.f248427b = resourceMapper;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        zel.g instance = (zel.g) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        this.f248427b.getClass();
        targetCollection.add(b(hph.j.a(instance)));
    }
}
