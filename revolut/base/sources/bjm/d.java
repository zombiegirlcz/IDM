package bjm;

import ao.h;
import bmm.u;
import bmm.z;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlinx.serialization.KSerializer;
import qlm.l;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16202a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16204c;

    public d(h hVar, KClass kClass) {
        this.f16203b = hVar;
        this.f16204c = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        bmm.b bVar;
        Throwable th10;
        switch (this.f16202a) {
            case 0:
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) this.f16203b;
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) this.f16204c;
                if (kotlinBuiltIns.f186463a == null) {
                    kotlinBuiltIns.f186463a = moduleDescriptorImpl;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns.f186463a + " (attempting to reset to " + moduleDescriptorImpl + ")");
            case 1:
                u uVar = (u) this.f16204c;
                z zVar = (z) this.f16203b;
                bmm.b bVar2 = bmm.b.INTERNAL_ERROR;
                IOException e = null;
                try {
                    try {
                        Intrinsics.checkNotNullParameter(this, "handler");
                    } catch (Throwable th11) {
                        th10 = th11;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bVar = bVar2;
                }
                if (!zVar.d(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th12) {
                        th10 = th12;
                    }
                } while (zVar.d(false, this));
                bVar = bmm.b.NO_ERROR;
                try {
                    try {
                        uVar.d(bVar, bmm.b.CANCEL, null);
                    } catch (IOException e4) {
                        e = e4;
                        bmm.b bVar3 = bmm.b.PROTOCOL_ERROR;
                        uVar.d(bVar3, bVar3, e);
                    }
                    vlm.h.f(zVar);
                    return Unit.f186387a;
                } catch (Throwable th13) {
                    th10 = th13;
                }
                bVar = bVar2;
                uVar.d(bVar, bVar2, e);
                vlm.h.f(zVar);
                throw th10;
            default:
                return new l((KSerializer) ((Function1) ((h) this.f16203b).f7847b).invoke((KClass) this.f16204c));
        }
    }

    public d(KotlinBuiltIns kotlinBuiltIns, ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f16204c = kotlinBuiltIns;
        this.f16203b = moduleDescriptorImpl;
    }

    public d(u uVar, z reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f16204c = uVar;
        this.f16203b = reader;
    }
}
