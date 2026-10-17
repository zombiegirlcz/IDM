package kotlin.reflect.jvm.internal.impl.descriptors;

import af.f;
import dfm.c;
import djm.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;

    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;

    @NotNull
    public static final DescriptorVisibility INHERITED;

    @NotNull
    public static final DescriptorVisibility INTERNAL;

    @NotNull
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set<DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;

    @NotNull
    public static final DescriptorVisibility LOCAL;

    @NotNull
    public static final DescriptorVisibility PRIVATE;

    @NotNull
    public static final DescriptorVisibility PRIVATE_TO_THIS;

    @NotNull
    public static final DescriptorVisibility PROTECTED;

    @NotNull
    public static final DescriptorVisibility PUBLIC;

    @NotNull
    public static final DescriptorVisibility UNKNOWN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f186522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f186523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ModuleVisibilityHelper f186524c;
    public static final HashMap d;

    static {
        b bVar = new b(Visibilities.Private.INSTANCE, 0);
        PRIVATE = bVar;
        b bVar2 = new b(Visibilities.PrivateToThis.INSTANCE, 1);
        PRIVATE_TO_THIS = bVar2;
        b bVar3 = new b(Visibilities.Protected.INSTANCE, 2);
        PROTECTED = bVar3;
        int i = 3;
        b bVar4 = new b(Visibilities.Internal.INSTANCE, i);
        INTERNAL = bVar4;
        int i2 = 4;
        b bVar5 = new b(Visibilities.Public.INSTANCE, i2);
        PUBLIC = bVar5;
        b bVar6 = new b(Visibilities.Local.INSTANCE, 5);
        LOCAL = bVar6;
        b bVar7 = new b(Visibilities.Inherited.INSTANCE, 6);
        INHERITED = bVar7;
        b bVar8 = new b(Visibilities.InvisibleFake.INSTANCE, 7);
        INVISIBLE_FAKE = bVar8;
        b bVar9 = new b(Visibilities.Unknown.INSTANCE, 8);
        UNKNOWN = bVar9;
        DescriptorVisibility[] elements = {bVar, bVar2, bVar4, bVar6};
        Intrinsics.checkNotNullParameter(elements, "elements");
        INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(d.y0(elements));
        HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        mapNewHashMapWithExpectedSize.put(bVar2, 0);
        mapNewHashMapWithExpectedSize.put(bVar, 0);
        mapNewHashMapWithExpectedSize.put(bVar4, 1);
        mapNewHashMapWithExpectedSize.put(bVar3, 1);
        mapNewHashMapWithExpectedSize.put(bVar5, 2);
        f186522a = Collections.unmodifiableMap(mapNewHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = bVar5;
        f186523b = new c(i);
        ALWAYS_SUITABLE_RECEIVER = new qf.b(i);
        FALSE_IF_PROTECTED = new f(i2);
        Iterator it8 = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f186524c = it8.hasNext() ? (ModuleVisibilityHelper) it8.next() : ModuleVisibilityHelper.EMPTY.INSTANCE;
        d = new HashMap();
        b(bVar);
        b(bVar2);
        b(bVar3);
        b(bVar4);
        b(bVar5);
        b(bVar6);
        b(bVar7);
        b(bVar8);
        b(bVar9);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.a(int):void");
    }

    public static void b(DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        d.put(delegatedDescriptorVisibility.getDelegate(), delegatedDescriptorVisibility);
    }

    public static Integer compare(@NotNull DescriptorVisibility descriptorVisibility, @NotNull DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            a(12);
            throw null;
        }
        if (descriptorVisibility2 == null) {
            a(13);
            throw null;
        }
        Integer numCompareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (numCompareTo != null) {
            return numCompareTo;
        }
        Integer numCompareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (numCompareTo2 != null) {
            return Integer.valueOf(-numCompareTo2.intValue());
        }
        return null;
    }

    public static DeclarationDescriptorWithVisibility findInvisibleMember(ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityFindInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            a(8);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(9);
            throw null;
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityFindInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityFindInvisibleMember;
    }

    public static boolean inSameFile(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(6);
            throw null;
        }
        if (declarationDescriptor2 == null) {
            a(7);
            throw null;
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            return descriptorVisibility == PRIVATE || descriptorVisibility == PRIVATE_TO_THIS;
        }
        a(14);
        throw null;
    }

    public static boolean isVisibleIgnoringReceiver(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z) {
        if (declarationDescriptorWithVisibility == null) {
            a(2);
            throw null;
        }
        if (declarationDescriptor != null) {
            return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z) == null;
        }
        a(3);
        throw null;
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility) {
        if (visibility == null) {
            a(15);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) d.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
