package qm;

import android.os.Build;
import android.security.keystore.KeyInfo;
import com.revolut.data.model.Data;
import efm.r;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings;
import rc.f;
import rfm.f0;
import rm0.e0;
import sl3.k;
import ulm.p0;
import vc.j;
import w4l.h;
import zc.m;
import zc.n;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements o, n, wc.n, DeclarationDescriptorVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f247740b;

    public e(bo.c function) {
        this.f247739a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f247740b = function;
    }

    @Override // zc.o
    public /* bridge */ /* synthetic */ Object a() {
        return new rc.c((f) ((m) this.f247740b).a());
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f247739a) {
            case 1:
                return ((bo.c) this.f247740b).invoke(obj2);
            default:
                Object objApply = ((o) ((f0) this.f247740b).f253935b).apply(new Object[]{obj2});
                mfm.f.b(objApply, "The zipper returned a null value");
                return objApply;
        }
    }

    public void b(PrivateKey key) throws NoSuchAlgorithmException, NoSuchProviderException {
        boolean zIsInsideSecureHardware;
        Intrinsics.checkNotNullParameter(key, "key");
        KeyFactory keyFactory = KeyFactory.getInstance(key.getAlgorithm(), "AndroidKeyStore");
        Intrinsics.checkNotNullExpressionValue(keyFactory, "getInstance(...)");
        try {
            KeySpec keySpec = keyFactory.getKeySpec(key, KeyInfo.class);
            Intrinsics.h(keySpec);
            KeyInfo keyInfo = (KeyInfo) keySpec;
            if (Build.VERSION.SDK_INT >= 31) {
                zIsInsideSecureHardware = true;
                if (keyInfo.getSecurityLevel() < 1) {
                    zIsInsideSecureHardware = false;
                }
            } else {
                zIsInsideSecureHardware = keyInfo.isInsideSecureHardware();
            }
            if (!zIsInsideSecureHardware) {
                d("securityLevel is insufficient");
            }
            if (!keyInfo.isUserAuthenticationRequired() || keyInfo.isUserAuthenticationRequirementEnforcedBySecureHardware()) {
                return;
            }
            d("isUserAuthenticationRequirementEnforcedBySecureHardware is false");
        } catch (InvalidKeySpecException unused) {
            throw new SecurityException();
        }
    }

    public void c(ByteString byteString) {
        if (!byteString.d()) {
            if (!(byteString instanceof i)) {
                String strValueOf = String.valueOf(byteString.getClass());
                throw new IllegalArgumentException(v0.a.i(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            i iVar = (i) byteString;
            c(iVar.f187535b);
            c(iVar.f187536c);
            return;
        }
        int size = byteString.size();
        int[] iArr = i.f187533g;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f247740b;
        if (stack.isEmpty() || ((ByteString) stack.peek()).size() >= i) {
            stack.push(byteString);
            return;
        }
        int i2 = iArr[iBinarySearch];
        ByteString iVar2 = (ByteString) stack.pop();
        while (!stack.isEmpty() && ((ByteString) stack.peek()).size() < i2) {
            iVar2 = new i((ByteString) stack.pop(), iVar2);
        }
        i iVar3 = new i(iVar2, byteString);
        while (!stack.isEmpty()) {
            int[] iArr2 = i.f187533g;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, iVar3.f187534a);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                iVar3 = new i((ByteString) stack.pop(), iVar3);
            }
        }
        stack.push(iVar3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public void d(String str) {
        e0 e0Var = (e0) this.f247740b;
        if (e0Var.a() && ((Boolean) e0Var.f255153c.getValue()).booleanValue()) {
            throw new SecurityException();
        }
        SecurityException securityException = new SecurityException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, securityException, h0Var);
    }

    public boolean e(CharSequence charSequence, yem.m mVar) {
        String strA = mVar.a();
        if (strA.length() != 0) {
            Matcher matcher = ((j) this.f247740b).a(strA).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    public akg.n f() {
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vj1.b bVar = (vj1.b) this.f247740b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar.e.b(Unit.f186387a, loadingStrategy), new se0.a(28));
    }

    public r g(long j2) {
        r rVarG = ((k) ((fl3.a) this.f247740b)).g();
        zhm.f0 f0Var = zhm.f0.f322471a;
        r rVarStartWith = rVarG.startWith(new Data(f0Var, null, true, 2, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return ue0.e.E(nim.a.w(rVarStartWith, new nxc.a(j2, 20)), new Data(f0Var, null, false, 6, null));
    }

    public void h(PropertyAccessorDescriptor descriptor, StringBuilder builder, String str) throws IOException {
        DescriptorRendererImpl descriptorRendererImpl = (DescriptorRendererImpl) this.f247740b;
        int i = DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings.$EnumSwitchMapping$0[descriptorRendererImpl.getPropertyAccessorRenderingPolicy().ordinal()];
        if (i == 1) {
            descriptorRendererImpl.l(descriptor, builder);
            builder.append(str.concat(" for "));
            PropertyDescriptor correspondingProperty = descriptor.getCorrespondingProperty();
            Intrinsics.checkNotNullExpressionValue(correspondingProperty, "getCorrespondingProperty(...)");
            DescriptorRendererImpl.access$renderProperty(descriptorRendererImpl, correspondingProperty, builder);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.access$renderFunction(descriptorRendererImpl, descriptor, builder);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitClassDescriptor(ClassDescriptor descriptor, Object obj2) throws IOException {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DescriptorRendererImpl.access$renderClass((DescriptorRendererImpl) this.f247740b, descriptor, builder);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, Object obj2) throws IOException {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DescriptorRendererImpl.access$renderConstructor((DescriptorRendererImpl) this.f247740b, constructorDescriptor, builder);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitFunctionDescriptor(FunctionDescriptor descriptor, Object obj2) throws IOException {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DescriptorRendererImpl.access$renderFunction((DescriptorRendererImpl) this.f247740b, descriptor, builder);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitModuleDeclaration(ModuleDescriptor descriptor, Object obj2) {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((DescriptorRendererImpl) this.f247740b).o(descriptor, builder, true);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageFragmentDescriptor(PackageFragmentDescriptor descriptor, Object obj2) {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DescriptorRendererImpl.access$renderPackageFragment((DescriptorRendererImpl) this.f247740b, descriptor, builder);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageViewDescriptor(PackageViewDescriptor descriptor, Object obj2) {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DescriptorRendererImpl.access$renderPackageView((DescriptorRendererImpl) this.f247740b, descriptor, builder);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyDescriptor(PropertyDescriptor descriptor, Object obj2) throws IOException {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DescriptorRendererImpl.access$renderProperty((DescriptorRendererImpl) this.f247740b, descriptor, builder);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyGetterDescriptor(PropertyGetterDescriptor descriptor, Object obj2) throws IOException {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        h(descriptor, builder, "getter");
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertySetterDescriptor(PropertySetterDescriptor descriptor, Object obj2) throws IOException {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        h(descriptor, builder, "setter");
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitReceiverParameterDescriptor(ReceiverParameterDescriptor descriptor, Object obj2) {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(descriptor.getName());
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeAliasDescriptor(TypeAliasDescriptor descriptor, Object obj2) {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DescriptorRendererImpl.access$renderTypeAlias((DescriptorRendererImpl) this.f247740b, descriptor, builder);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeParameterDescriptor(TypeParameterDescriptor descriptor, Object obj2) {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((DescriptorRendererImpl) this.f247740b).w(descriptor, builder, true);
        return Unit.f186387a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitValueParameterDescriptor(ValueParameterDescriptor descriptor, Object obj2) {
        StringBuilder builder = (StringBuilder) obj2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((DescriptorRendererImpl) this.f247740b).A(descriptor, true, builder, true);
        return Unit.f186387a;
    }

    @Override // wc.n
    public Object zza() {
        switch (this.f247739a) {
            case 7:
                return ((r8.o) this.f247740b).f252294a;
            case 8:
                vc.n nVar = (vc.n) ((wc.n) this.f247740b).zza();
                if (nVar != null) {
                    return nVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new vc.r(((r8.o) ((e) this.f247740b).f247740b).f252294a);
        }
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f247739a = i;
        this.f247740b = obj2;
    }

    public e(um.c errorsDispatcher) {
        this.f247739a = 0;
        Intrinsics.checkNotNullParameter(errorsDispatcher, "errorsDispatcher");
        this.f247740b = errorsDispatcher;
    }

    public e(fl3.a contactsRepository) {
        this.f247739a = 12;
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        this.f247740b = contactsRepository;
    }

    public e(yk0.a databaseSessionProvider) {
        this.f247739a = 13;
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        this.f247740b = yhm.j.b(new p0(databaseSessionProvider, 11));
    }

    public e(vj1.b advisedComponentsRepository) {
        this.f247739a = 4;
        Intrinsics.checkNotNullParameter(advisedComponentsRepository, "advisedComponentsRepository");
        this.f247740b = advisedComponentsRepository;
    }

    public e(Map currenciesInfo) {
        this.f247739a = 5;
        Intrinsics.checkNotNullParameter(currenciesInfo, "currenciesInfo");
        this.f247740b = currenciesInfo;
    }

    public e(e0 securityFeatureToggles) {
        this.f247739a = 3;
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f247740b = securityFeatureToggles;
    }

    public e(int i) {
        this.f247739a = i;
        switch (i) {
            case 14:
                this.f247740b = new j(100);
                break;
            default:
                this.f247740b = new Stack();
                break;
        }
    }
}
