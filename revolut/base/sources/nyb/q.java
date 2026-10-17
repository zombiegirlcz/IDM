package nyb;

import android.content.Intent;
import android.os.MessageQueue;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.sso.impl.domain.models.AuthLocation;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import dp4.c1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$Found;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$NotFound;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import m1c.s0;
import m1c.t0;
import m1c.v0;
import m1c.w0;
import om4.x2;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import vge.r0;
import vkm.j2;
import xvh.a;
import yhm.m;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f220830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f220831c;

    public /* synthetic */ q(Object obj2, Object obj3, int i) {
        this.f220829a = i;
        this.f220830b = obj2;
        this.f220831c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object extractNullability) {
        RevPointsOptInSource revPointsOptInSource;
        pd.b bVar;
        Map<Integer, JavaTypeQualifiers> map;
        JavaTypeQualifiers javaTypeQualifiers;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        List<TypeParameterMarker> parameters;
        KotlinTypeMarker kotlinTypeMarker;
        xvh.a bVar2;
        Object next;
        e93.q qVar;
        e93.f fVar;
        List list;
        Object next2;
        int i = 2;
        int i2 = 1;
        switch (this.f220829a) {
            case 0:
                t0 contentData = (t0) extractNullability;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                v0 v0Var = (v0) this.f220830b;
                v vVar = (v) this.f220831c;
                int i3 = v.e;
                vVar.getClass();
                if (v0Var.equals(v0.a.f201465a)) {
                    revPointsOptInSource = RevPointsOptInSource.SpendAnalytics.f84004a;
                } else {
                    if (!(v0Var instanceof w0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    revPointsOptInSource = RevPointsOptInSource.TransactionDetails.f84009a;
                }
                return new s0(v0Var, revPointsOptInSource, contentData);
            case 1:
                od0.i exchangeInfo = (od0.i) extractNullability;
                Intrinsics.checkNotNullParameter(exchangeInfo, "exchangeInfo");
                com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b bVar3 = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f220830b;
                dj0.d dVar = (dj0.d) this.f220831c;
                cli.y yVar = bVar3.z;
                dj0.d dVar2 = ((o27.l) ((j2) yVar.f22677a).getValue()).f221516a;
                o27.i iVar = (o27.i) exchangeInfo.f224257a;
                dj0.d dVar3 = iVar != null ? iVar.f221512a : dVar2;
                return new o27.k(new o27.h(dVar3.f(dj0.d.e), dVar3.h(dVar), dVar2.h(((o27.l) ((j2) yVar.f22677a).getValue()).f221517b)), (o27.i) exchangeInfo.f224257a, dVar);
            case 2:
                String facilityId = (String) extractNullability;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                okf.f fVar2 = (okf.f) this.f220830b;
                al4.n nVar = fVar2.f226011c;
                String transactionId = ((a3) this.f220831c).f272581b;
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                c1 c1Var = ((x2) nVar).f226745a;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return n14.k.p(nim.a.v(c1Var.f116615j.b(new cp4.q0(facilityId, transactionId), loadingStrategy), new fjm.j(fVar2, 6)), okf.d.f226007a);
            case 3:
                AuthenticationFlowContract$State update = (AuthenticationFlowContract$State) extractNullability;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object value = ((j2) ((com.revolut.sso.impl.ui.auth.n) this.f220830b).m0.f22677a).getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State");
                }
                AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) value;
                return authenticationFlowContract$State.O9((2037 & 1) != 0 ? authenticationFlowContract$State.getF106298g() : false, (2037 & 2) != 0 ? authenticationFlowContract$State.getF106299h() : null, (2037 & 4) != 0 ? authenticationFlowContract$State.getI() : (ArrayList) this.f220831c, (2037 & 8) != 0 ? authenticationFlowContract$State.getF106300j() : null, (2037 & 16) != 0 ? authenticationFlowContract$State.getK() : null, (2037 & 32) != 0 ? authenticationFlowContract$State.getF106301l() : null, (2037 & 64) != 0 ? authenticationFlowContract$State.getF106302m() : -1, (2037 & 128) != 0 ? authenticationFlowContract$State.getF106303n() : null, (2037 & 256) != 0 ? authenticationFlowContract$State.getO() : true, (2037 & 512) != 0 ? authenticationFlowContract$State.getF106304p() : true, (2037 & 1024) != 0 ? authenticationFlowContract$State.getF106305q() : false);
            case 4:
                AuthenticationFlowContract$State update2 = (AuthenticationFlowContract$State) extractNullability;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Object value2 = ((j2) ((com.revolut.sso.impl.ui.auth.n) this.f220830b).m0.f22677a).getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State");
                }
                AuthenticationFlowContract$State authenticationFlowContract$State2 = (AuthenticationFlowContract$State) value2;
                return authenticationFlowContract$State2.O9((2037 & 1) != 0 ? authenticationFlowContract$State2.getF106298g() : false, (2037 & 2) != 0 ? authenticationFlowContract$State2.getF106299h() : ((gkl.e0) this.f220831c).f144443a, (2037 & 4) != 0 ? authenticationFlowContract$State2.getI() : null, (2037 & 8) != 0 ? authenticationFlowContract$State2.getF106300j() : null, (2037 & 16) != 0 ? authenticationFlowContract$State2.getK() : null, (2037 & 32) != 0 ? authenticationFlowContract$State2.getF106301l() : null, (2037 & 64) != 0 ? authenticationFlowContract$State2.getF106302m() : -1, (2037 & 128) != 0 ? authenticationFlowContract$State2.getF106303n() : null, (2037 & 256) != 0 ? authenticationFlowContract$State2.getO() : true, (2037 & 512) != 0 ? authenticationFlowContract$State2.getF106304p() : true, (2037 & 1024) != 0 ? authenticationFlowContract$State2.getF106305q() : false);
            case 5:
                AuthenticationFlowContract$State update3 = (AuthenticationFlowContract$State) extractNullability;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Object value3 = ((j2) ((com.revolut.sso.impl.ui.auth.n) this.f220830b).m0.f22677a).getValue();
                if (value3 != null) {
                    return AuthenticationFlowContract$State.SignIn.a((AuthenticationFlowContract$State.SignIn) value3, yjl.h.b(((gnl.k) ((gnl.i) this.f220831c)).f145039a), null, null, 131067);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.SignIn");
            case 6:
                AuthenticationFlowContract$State update4 = (AuthenticationFlowContract$State) extractNullability;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Object value4 = ((j2) ((com.revolut.sso.impl.ui.auth.n) this.f220830b).m0.f22677a).getValue();
                if (value4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State");
                }
                AuthenticationFlowContract$State authenticationFlowContract$State3 = (AuthenticationFlowContract$State) value4;
                LocationDomain locationDomain = (LocationDomain) this.f220831c;
                return authenticationFlowContract$State3.O9((2037 & 1) != 0 ? authenticationFlowContract$State3.getF106298g() : false, (2037 & 2) != 0 ? authenticationFlowContract$State3.getF106299h() : null, (2037 & 4) != 0 ? authenticationFlowContract$State3.getI() : null, (2037 & 8) != 0 ? authenticationFlowContract$State3.getF106300j() : null, (2037 & 16) != 0 ? authenticationFlowContract$State3.getK() : null, (2037 & 32) != 0 ? authenticationFlowContract$State3.getF106301l() : null, (2037 & 64) != 0 ? authenticationFlowContract$State3.getF106302m() : -1, (2037 & 128) != 0 ? authenticationFlowContract$State3.getF106303n() : new AuthLocation(locationDomain.f78066a, locationDomain.f78067b), (2037 & 256) != 0 ? authenticationFlowContract$State3.getO() : true, (2037 & 512) != 0 ? authenticationFlowContract$State3.getF106304p() : true, (2037 & 1024) != 0 ? authenticationFlowContract$State3.getF106305q() : false);
            case 7:
                AuthenticationFlowContract$State update5 = (AuthenticationFlowContract$State) extractNullability;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Object value5 = ((j2) ((com.revolut.sso.impl.ui.auth.n) this.f220830b).m0.f22677a).getValue();
                if (value5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State");
                }
                AuthenticationFlowContract$State authenticationFlowContract$State4 = (AuthenticationFlowContract$State) value5;
                return authenticationFlowContract$State4.O9((2037 & 1) != 0 ? authenticationFlowContract$State4.getF106298g() : false, (2037 & 2) != 0 ? authenticationFlowContract$State4.getF106299h() : null, (2037 & 4) != 0 ? authenticationFlowContract$State4.getI() : null, (2037 & 8) != 0 ? authenticationFlowContract$State4.getF106300j() : null, (2037 & 16) != 0 ? authenticationFlowContract$State4.getK() : (HashSet) this.f220831c, (2037 & 32) != 0 ? authenticationFlowContract$State4.getF106301l() : null, (2037 & 64) != 0 ? authenticationFlowContract$State4.getF106302m() : -1, (2037 & 128) != 0 ? authenticationFlowContract$State4.getF106303n() : null, (2037 & 256) != 0 ? authenticationFlowContract$State4.getO() : true, (2037 & 512) != 0 ? authenticationFlowContract$State4.getF106304p() : true, (2037 & 1024) != 0 ? authenticationFlowContract$State4.getF106305q() : false);
            case 8:
                AuthenticationFlowContract$State update6 = (AuthenticationFlowContract$State) extractNullability;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                Object value6 = ((j2) ((com.revolut.sso.impl.ui.auth.n) this.f220830b).m0.f22677a).getValue();
                if (value6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.SignIn");
                }
                return AuthenticationFlowContract$State.SignIn.a((AuthenticationFlowContract$State.SignIn) this.f220831c, null, null, null, 131069);
            case 9:
                AuthenticationFlowContract$State update7 = (AuthenticationFlowContract$State) extractNullability;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                Object value7 = ((j2) ((com.revolut.sso.impl.ui.auth.n) this.f220830b).m0.f22677a).getValue();
                if (value7 != null) {
                    return AuthenticationFlowContract$State.AccessRecovery.a((AuthenticationFlowContract$State.AccessRecovery) value7, new Claim.IdentityId((String) this.f220831c), null, 16379);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.AccessRecovery");
            case 10:
                LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.f220830b;
                LazyJavaResolverContext lazyJavaResolverContext = (LazyJavaResolverContext) this.f220831c;
                Name name = (Name) extractNullability;
                int i5 = LazyJavaClassMemberScope.u;
                Intrinsics.checkNotNullParameter(name, "name");
                NotNullLazyValue notNullLazyValue = lazyJavaClassMemberScope.f186983q;
                ClassDescriptor classDescriptor = lazyJavaClassMemberScope.f186980m;
                if (((Set) notNullLazyValue.invoke()).contains(name)) {
                    JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
                    ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                    Intrinsics.h(classId);
                    JavaClass javaClassFindClass = finder.findClass(new JavaClassFinder.Request(classId.createNestedClassId(name), null, lazyJavaClassMemberScope.f186981n, 2, null));
                    if (javaClassFindClass == null) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.f186980m, javaClassFindClass, null, 8, null);
                    lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                if (!((Set) lazyJavaClassMemberScope.f186984r.invoke()).contains(name)) {
                    JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope.f186985s.invoke()).get(name);
                    if (javaField != null) {
                        return EnumEntrySyntheticClassDescriptor.create(lazyJavaResolverContext.getStorageManager(), lazyJavaClassMemberScope.f186980m, name, lazyJavaResolverContext.getStorageManager().createLazyValue(new pjm.e(lazyJavaClassMemberScope, i)), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaField), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaField));
                    }
                    return null;
                }
                aim.e eVarB = zhm.u.b();
                lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateNestedClass(classDescriptor, name, eVarB, lazyJavaResolverContext);
                aim.e eVarA = zhm.u.a(eVarB);
                int size = eVarA.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    return (ClassDescriptor) zhm.d0.K0(eVarA);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + eVarA).toString());
            case 11:
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) this.f220830b;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = (LazyJavaClassMemberScope) this.f220831c;
                Name accessorName = (Name) extractNullability;
                int i6 = LazyJavaClassMemberScope.u;
                Intrinsics.checkNotNullParameter(accessorName, "accessorName");
                return Intrinsics.f(simpleFunctionDescriptor.getName(), accessorName) ? zhm.u.c(simpleFunctionDescriptor) : zhm.d0.E0(lazyJavaClassMemberScope2.C(accessorName), lazyJavaClassMemberScope2.B(accessorName));
            case 12:
                LazyJavaPackageScope lazyJavaPackageScope = (LazyJavaPackageScope) this.f220830b;
                LazyJavaResolverContext lazyJavaResolverContext2 = (LazyJavaResolverContext) this.f220831c;
                pjm.i request = (pjm.i) extractNullability;
                int i21 = LazyJavaPackageScope.f186993q;
                Intrinsics.checkNotNullParameter(request, "request");
                ClassId classId2 = new ClassId(lazyJavaPackageScope.f186995n.getFqName(), request.f236894a);
                JavaClass javaClassFindClass2 = request.f236895b;
                KotlinClassFinder.Result resultFindKotlinClassOrContent = javaClassFindClass2 != null ? lazyJavaResolverContext2.getComponents().getKotlinClassFinder().findKotlinClassOrContent(javaClassFindClass2, lazyJavaPackageScope.m()) : lazyJavaResolverContext2.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId2, lazyJavaPackageScope.m());
                KotlinJvmBinaryClass kotlinJvmBinaryClass = resultFindKotlinClassOrContent != null ? resultFindKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
                ClassId classId3 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
                if (classId3 != null && (classId3.isNestedClass() || classId3.isLocal())) {
                    return null;
                }
                if (kotlinJvmBinaryClass == null) {
                    bVar = LazyJavaPackageScope$KotlinClassLookupResult$NotFound.INSTANCE;
                } else if (kotlinJvmBinaryClass.getClassHeader().getKind() == KotlinClassHeader.Kind.CLASS) {
                    final ClassDescriptor classDescriptorResolveClass = lazyJavaPackageScope.f186999a.getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
                    bVar = classDescriptorResolveClass != null ? new pd.b(classDescriptorResolveClass) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$Found

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final ClassDescriptor f186997b;

                        {
                            Intrinsics.checkNotNullParameter(classDescriptorResolveClass, "descriptor");
                            this.f186997b = classDescriptorResolveClass;
                        }

                        @NotNull
                        public final ClassDescriptor getDescriptor() {
                            return this.f186997b;
                        }
                    } : LazyJavaPackageScope$KotlinClassLookupResult$NotFound.INSTANCE;
                } else {
                    bVar = LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass.INSTANCE;
                }
                if (bVar instanceof LazyJavaPackageScope$KotlinClassLookupResult$Found) {
                    return ((LazyJavaPackageScope$KotlinClassLookupResult$Found) bVar).getDescriptor();
                }
                if (bVar instanceof LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass) {
                    return null;
                }
                if (!(bVar instanceof LazyJavaPackageScope$KotlinClassLookupResult$NotFound)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (javaClassFindClass2 == null) {
                    JavaClassFinder finder2 = lazyJavaResolverContext2.getComponents().getFinder();
                    KotlinClassFinder.Result.ClassFileContent classFileContent = resultFindKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultFindKotlinClassOrContent : null;
                    javaClassFindClass2 = finder2.findClass(new JavaClassFinder.Request(classId2, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
                }
                JavaClass javaClass = javaClassFindClass2;
                if ((javaClass != null ? javaClass.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                    FqName fqName = javaClass != null ? javaClass.getFqName() : null;
                    if (fqName == null || fqName.isRoot() || !Intrinsics.f(fqName.parent(), lazyJavaPackageScope.f186995n.getFqName())) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor2 = new LazyJavaClassDescriptor(lazyJavaResolverContext2, lazyJavaPackageScope.f186995n, javaClass, null, 8, null);
                    lazyJavaResolverContext2.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor2);
                    return lazyJavaClassDescriptor2;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass + "\nClassId: " + classId2 + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), javaClass, lazyJavaPackageScope.m()) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), classId2, lazyJavaPackageScope.m()) + '\n');
            case 13:
                os2.g gVar = (os2.g) this.f220830b;
                q80.a handler = (q80.a) this.f220831c;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(handler, "handler");
                ((MessageQueue) gVar.f229224b).removeIdleHandler(handler);
                return Unit.f186387a;
            case 14:
                AbstractSignatureParts abstractSignatureParts = (AbstractSignatureParts) this.f220830b;
                rjm.a aVar = (rjm.a) this.f220831c;
                Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
                return Boolean.valueOf(abstractSignatureParts.forceWarning(extractNullability, aVar.f254691a));
            case 15:
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.f220830b;
                JavaTypeQualifiers[] javaTypeQualifiersArr = (JavaTypeQualifiers[]) this.f220831c;
                int iIntValue = ((Number) extractNullability).intValue();
                return (typeEnhancementInfo == null || (map = typeEnhancementInfo.getMap()) == null || (javaTypeQualifiers = map.get(Integer.valueOf(iIntValue))) == null) ? (iIntValue < 0 || iIntValue >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[iIntValue] : javaTypeQualifiers;
            case 16:
                AbstractSignatureParts abstractSignatureParts2 = (AbstractSignatureParts) this.f220830b;
                TypeSystemContext typeSystemContext = (TypeSystemContext) this.f220831c;
                rjm.a it8 = (rjm.a) extractNullability;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (abstractSignatureParts2.getSkipRawTypeArguments() && (kotlinTypeMarker = it8.f254691a) != null && typeSystemContext.isRawType(kotlinTypeMarker)) {
                    return null;
                }
                KotlinTypeMarker kotlinTypeMarker2 = it8.f254691a;
                JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = it8.f254692b;
                if (kotlinTypeMarker2 == null || (typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2)) == null || (parameters = typeSystemContext.getParameters(typeConstructorMarkerTypeConstructor)) == null) {
                    return null;
                }
                List<TypeParameterMarker> list2 = parameters;
                List<TypeArgumentMarker> arguments = typeSystemContext.getArguments(it8.f254691a);
                Iterator<T> it9 = list2.iterator();
                Iterator<T> it10 = arguments.iterator();
                ArrayList arrayList = new ArrayList(Math.min(zhm.w.t(list2, 10), zhm.w.t(arguments, 10)));
                while (it9.hasNext() && it10.hasNext()) {
                    TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it9.next();
                    KotlinTypeMarker type = typeSystemContext.getType((TypeArgumentMarker) it10.next());
                    arrayList.add(type == null ? new rjm.a(null, javaTypeQualifiersByElementType, typeParameterMarker) : new rjm.a(type, abstractSignatureParts2.getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, abstractSignatureParts2.getAnnotations(type)), typeParameterMarker));
                }
                return arrayList;
            case 17:
                Set ids = (Set) extractNullability;
                Intrinsics.checkNotNullParameter(ids, "it");
                ugc.a aVar2 = ((rlh.j) this.f220830b).f255062s;
                w4l.k loadingStrategy2 = (w4l.k) this.f220831c;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(ids, "ids");
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                e8h.c0 c0Var = (e8h.c0) aVar2.f279998b;
                Intrinsics.checkNotNullParameter(ids, "ids");
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                return c0Var.d.b(ids, loadingStrategy2);
            case 18:
                SavingsAccountDetails vault = (SavingsAccountDetails) extractNullability;
                djb.s sVar = djb.s.f115286a;
                Intrinsics.checkNotNullParameter(vault, "vault");
                pcd.h0[] elements = {pcd.h0.ACTIVE, pcd.h0.PENDING_ACTIVATION};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (!kotlin.collections.d.y0(elements).contains(vault.f86460a.f234883c)) {
                    return zi0.c.i(sVar);
                }
                Intrinsics.checkNotNullParameter(vault, "<this>");
                SavingsProductData savingsProductData = vault.f86462c;
                pcd.s sVar2 = vault.f86460a;
                ncd.h hVar = savingsProductData != null ? savingsProductData.f86683a.f86628r : null;
                int i22 = hVar == null ? -1 : rnb.n.f255569a[hVar.ordinal()];
                if (i22 == -1) {
                    bVar2 = null;
                } else if (i22 == 1) {
                    bVar2 = a.b.f309269a;
                } else if (i22 == 2) {
                    bVar2 = a.C1716a.f309267a;
                } else if (i22 == 3 || i22 == 4) {
                    bVar2 = new xvh.b(sVar2.f);
                } else {
                    if (i22 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2 = null;
                }
                return bVar2 == null ? zi0.c.i(sVar) : nim.a.v(rd0.e.b(xvh.c.c(((rnb.m) this.f220830b).f255568c, bVar2, null, 2)), new rjm.d((String) this.f220831c, 10));
            case 19:
                List it11 = (List) extractNullability;
                Intrinsics.checkNotNullParameter(it11, "it");
                nkm.h hVarN = nkm.y.n(nkm.y.n(zhm.d0.Q(it11), new ro7.n(((l80.f) ((s6e.z) this.f220830b).o).k(), 7)), new d27.j0(i2, (Set) this.f220831c));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                nkm.g gVar2 = new nkm.g(hVarN);
                while (gVar2.hasNext()) {
                    Object next3 = gVar2.next();
                    sua.b bVar4 = ((qua.p) next3).J;
                    String str = bVar4 != null ? bVar4.f265696a : null;
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add(next3);
                }
                return linkedHashMap;
            case 20:
                List groups = (List) extractNullability;
                Intrinsics.checkNotNullParameter(groups, "groups");
                List list3 = (List) this.f220830b;
                com.revolut.feature.card_design.impl.card_design.carousel.e eVar = (com.revolut.feature.card_design.impl.card_design.carousel.e) this.f220831c;
                gte.a aVar3 = eVar.D;
                CardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition cardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition = CardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition.f64538c;
                ArrayList arrayListA = lx2.e.a(groups, ((jte.d) aVar3).c(cardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition), list3);
                ArrayList arrayListB = lx2.e.b(arrayListA, list3, ((jte.d) aVar3).c(cardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition), new sx2.q(eVar));
                CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = eVar.o;
                String str2 = cardDesignCarouselScreenContract$InputData.e;
                String str3 = cardDesignCarouselScreenContract$InputData.f;
                if (str2 == null && str3 == null) {
                    qVar = (e93.q) zhm.d0.d0(groups);
                } else {
                    Iterator it12 = arrayListA.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next = it12.next();
                            e93.q qVar2 = (e93.q) next;
                            if (!Intrinsics.f(qVar2.f123889c, cardDesignCarouselScreenContract$InputData.e)) {
                                List list4 = qVar2.d;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                                Iterator it13 = list4.iterator();
                                while (it13.hasNext()) {
                                    arrayList2.add(((e93.f) it13.next()).c().f13615a);
                                }
                                if (zhm.d0.T(arrayList2, str3)) {
                                }
                            }
                        } else {
                            next = null;
                        }
                    }
                    qVar = (e93.q) next;
                }
                if (qVar == null || (list = qVar.d) == null) {
                    fVar = null;
                } else {
                    Iterator it14 = list.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            next2 = it14.next();
                            if (Intrinsics.f(((e93.f) next2).c().f13615a, str3)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    fVar = (e93.f) next2;
                }
                return (str3 == null || fVar == null) ? new Pair(qVar, arrayListB) : new Pair(e93.q.a(qVar, null, fVar, 1), arrayListB);
            case 21:
                t7f.d update8 = (t7f.d) extractNullability;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return t7f.d.a(update8, (Data) this.f220830b, (Data) this.f220831c, null, null, null, 28);
            case 22:
                u6c.j0 it15 = (u6c.j0) extractNullability;
                Intrinsics.checkNotNullParameter(it15, "it");
                tdc.r rVar = (tdc.r) this.f220830b;
                q6c.h hVar2 = (q6c.h) this.f220831c;
                vki.a aVar4 = rVar.f269966p;
                rVar.X2(aVar4, new s06.e(rVar, 25, it15, hVar2));
                return aVar4.B(new tcg.a0(13));
            case 23:
                kpi.a aVar5 = (kpi.a) extractNullability;
                skm.l lVar = (skm.l) this.f220830b;
                if (lVar.d()) {
                    v99.c cVar = (v99.c) this.f220831c;
                    Intrinsics.h(aVar5);
                    cVar.getClass();
                    Intent intent = aVar5.f188248c;
                    obj = intent != null ? (ExchangeGlobalAccessOutput) intent.getParcelableExtra("EXCHANGE_GLOBAL_ACCESS_OUTPUT") : null;
                    if (obj == null) {
                        obj = aVar5.f188247b == -1 ? ExchangeGlobalAccessOutput.FeatureAvailable.f78171a : ExchangeGlobalAccessOutput.FeatureNotAvailable.f78172a;
                    }
                    m.Companion companion = yhm.m.INSTANCE;
                    lVar.resumeWith(obj);
                }
                return Unit.f186387a;
            case 24:
                List rates = (List) extractNullability;
                Intrinsics.checkNotNullParameter(rates, "rates");
                xi0.b bVar5 = (xi0.b) this.f220830b;
                Intrinsics.h(bVar5);
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f220831c;
                List list5 = rates;
                int iB = zhm.q0.b(zhm.w.t(list5, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
                for (Object obj2 : list5) {
                    linkedHashMap3.put(((n9l.a) obj2).f213661a, obj2);
                }
                return new r0(bVar5, linkedHashMap2, linkedHashMap3);
            case 25:
                wnc.m updateState = (wnc.m) extractNullability;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wnc.m.a(updateState, null, null, null, null, null, zhm.r0.q(updateState.f, new Pair((Template) this.f220830b, (doc.j) this.f220831c)), null, 95);
            case 26:
                try {
                    ((wtc.e) this.f220830b).f299864a.unregisterNetworkCallback((wtc.d) this.f220831c);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return Unit.f186387a;
            case 27:
                List rates2 = (List) extractNullability;
                Intrinsics.checkNotNullParameter(rates2, "rates");
                dj0.d dVar4 = (dj0.d) this.f220830b;
                xi0.b bVar6 = (xi0.b) this.f220831c;
                Iterator it16 = rates2.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        Object next4 = it16.next();
                        n9l.a aVar6 = (n9l.a) next4;
                        if (Intrinsics.f(aVar6.f213661a, dVar4.f115083b) && Intrinsics.f(aVar6.f213662b, bVar6)) {
                            obj = next4;
                        }
                    }
                }
                n9l.a aVar7 = (n9l.a) obj;
                if (aVar7 != null) {
                    return pyd.c.K(dVar4, aVar7.f213663c, aVar7.f213662b);
                }
                throw new IllegalStateException(("Rate not found (from: " + dVar4.f115083b.f306286a + ", to: " + bVar6.f306286a + ")").toString());
            case 28:
                ((OverridingStrategy) this.f220830b).inheritanceConflict((CallableMemberDescriptor) this.f220831c, (CallableMemberDescriptor) extractNullability);
                return Unit.f186387a;
            default:
                ((CompletableFuture) this.f220830b).cancel(false);
                ((xkm.a) this.f220831c).cont = null;
                return Unit.f186387a;
        }
    }
}
