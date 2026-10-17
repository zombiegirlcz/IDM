package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    public FieldDescriptor A;
    public FieldDescriptor B;
    public final Modality i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DescriptorVisibility f186642j;
    public Collection k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PropertyDescriptor f186643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f186644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f186645n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f186646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f186647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f186648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f186649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f186650t;
    public ReceiverParameterDescriptor u;
    public ReceiverParameterDescriptor v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f186651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PropertyGetterDescriptorImpl f186652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PropertySetterDescriptor f186653y;
    public boolean z;

    /* JADX INFO: loaded from: classes14.dex */
    public class CopyConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DeclarationDescriptor f186654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Modality f186655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DescriptorVisibility f186656c;
        public CallableMemberDescriptor.Kind e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ReceiverParameterDescriptor f186658h;
        public final Name i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final KotlinType f186659j;
        public PropertyDescriptor d = null;
        public TypeSubstitution f = TypeSubstitution.EMPTY;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f186657g = true;

        public CopyConfiguration() {
            this.f186654a = PropertyDescriptorImpl.this.getContainingDeclaration();
            this.f186655b = PropertyDescriptorImpl.this.getModality();
            this.f186656c = PropertyDescriptorImpl.this.getVisibility();
            this.e = PropertyDescriptorImpl.this.getKind();
            this.f186658h = PropertyDescriptorImpl.this.u;
            this.i = PropertyDescriptorImpl.this.getName();
            this.f186659j = PropertyDescriptorImpl.this.getType();
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorWithInitializerImpl] */
        /* JADX WARN: Type inference failed for: r13v4 */
        /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl] */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor] */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v3 */
        /* JADX WARN: Type inference failed for: r19v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor] */
        /* JADX WARN: Type inference failed for: r19v5 */
        /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v15, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r4v14, types: [kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor] */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r4v21 */
        /* JADX WARN: Type inference failed for: r4v22, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor] */
        /* JADX WARN: Type inference failed for: r4v27 */
        /* JADX WARN: Type inference failed for: r4v28 */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v18, types: [kotlin.reflect.jvm.internal.impl.types.KotlinType] */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor] */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor] */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v7 */
        public PropertyDescriptor build() {
            ReceiverParameterDescriptor receiverParameterDescriptor;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
            ?? propertyGetterDescriptorImpl;
            ?? propertySetterDescriptorImpl;
            TypeSubstitutor typeSubstitutor;
            Function0 function0;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl3;
            PropertyDescriptorImpl propertyDescriptorImpl = PropertyDescriptorImpl.this;
            propertyDescriptorImpl.getClass();
            DeclarationDescriptor declarationDescriptor = this.f186654a;
            Modality modality = this.f186655b;
            DescriptorVisibility descriptorVisibility = this.f186656c;
            PropertyDescriptor propertyDescriptor = this.d;
            CallableMemberDescriptor.Kind kind = this.e;
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl4 = null;
            if (sourceElement == null) {
                PropertyDescriptorImpl.a(28);
                throw null;
            }
            ?? B = propertyDescriptorImpl.b(declarationDescriptor, modality, descriptorVisibility, propertyDescriptor, kind, this.i, sourceElement);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptorImpl.getTypeParameters();
            ArrayList arrayList = new ArrayList(typeParameters.size());
            TypeSubstitutor typeSubstitutorSubstituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, this.f, B, arrayList);
            Variance variance = Variance.OUT_VARIANCE;
            KotlinType kotlinType = this.f186659j;
            KotlinType kotlinTypeSubstitute = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, variance);
            if (kotlinTypeSubstitute != null) {
                Variance variance2 = Variance.IN_VARIANCE;
                KotlinType kotlinTypeSubstitute2 = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, variance2);
                if (kotlinTypeSubstitute2 != null) {
                    B.setInType(kotlinTypeSubstitute2);
                }
                ReceiverParameterDescriptor receiverParameterDescriptor2 = this.f186658h;
                if (receiverParameterDescriptor2 != null) {
                    ReceiverParameterDescriptor receiverParameterDescriptorSubstitute = receiverParameterDescriptor2.substitute(typeSubstitutorSubstituteTypeParameters);
                    receiverParameterDescriptor = receiverParameterDescriptorSubstitute != null ? receiverParameterDescriptorSubstitute : null;
                }
                ReceiverParameterDescriptor receiverParameterDescriptor3 = propertyDescriptorImpl.v;
                if (receiverParameterDescriptor3 != null) {
                    KotlinType kotlinTypeSubstitute3 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), variance2);
                    receiverParameterDescriptorImpl = kotlinTypeSubstitute3 == null ? null : new ReceiverParameterDescriptorImpl(B, new ExtensionReceiver(B, kotlinTypeSubstitute3, receiverParameterDescriptor3.getValue()), receiverParameterDescriptor3.getAnnotations());
                } else {
                    receiverParameterDescriptorImpl = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ReceiverParameterDescriptor receiverParameterDescriptor4 : propertyDescriptorImpl.f186650t) {
                    KotlinType kotlinTypeSubstitute4 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor4.getType(), Variance.IN_VARIANCE);
                    if (kotlinTypeSubstitute4 == null) {
                        receiverParameterDescriptorImpl2 = receiverParameterDescriptorImpl4;
                        receiverParameterDescriptorImpl3 = receiverParameterDescriptorImpl2;
                    } else {
                        receiverParameterDescriptorImpl3 = receiverParameterDescriptorImpl4;
                        receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(B, new ContextReceiver(B, kotlinTypeSubstitute4, ((ImplicitContextReceiver) receiverParameterDescriptor4.getValue()).getCustomLabelName(), receiverParameterDescriptor4.getValue()), receiverParameterDescriptor4.getAnnotations());
                    }
                    if (receiverParameterDescriptorImpl2 != null) {
                        arrayList2.add(receiverParameterDescriptorImpl2);
                    }
                    receiverParameterDescriptorImpl4 = receiverParameterDescriptorImpl3;
                }
                ?? r212 = receiverParameterDescriptorImpl4;
                B.setType(kotlinTypeSubstitute, arrayList, receiverParameterDescriptor, receiverParameterDescriptorImpl, arrayList2);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = propertyDescriptorImpl.f186652x;
                if (propertyGetterDescriptorImpl2 == null) {
                    propertyGetterDescriptorImpl = r212;
                } else {
                    Annotations annotations = propertyGetterDescriptorImpl2.getAnnotations();
                    Modality modality2 = this.f186655b;
                    DescriptorVisibility visibility = propertyDescriptorImpl.f186652x.getVisibility();
                    if (this.e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility.normalize())) {
                        visibility = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    DescriptorVisibility descriptorVisibility2 = visibility;
                    boolean zIsDefault = propertyDescriptorImpl.f186652x.isDefault();
                    boolean zIsExternal = propertyDescriptorImpl.f186652x.isExternal();
                    boolean zIsInline = propertyDescriptorImpl.f186652x.isInline();
                    CallableMemberDescriptor.Kind kind2 = this.e;
                    PropertyDescriptor propertyDescriptor2 = this.d;
                    propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(B, annotations, modality2, descriptorVisibility2, zIsDefault, zIsExternal, zIsInline, kind2, propertyDescriptor2 == null ? r212 : propertyDescriptor2.getGetter(), SourceElement.NO_SOURCE);
                }
                if (propertyGetterDescriptorImpl != 0) {
                    KotlinType returnType = propertyDescriptorImpl.f186652x.getReturnType();
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = propertyDescriptorImpl.f186652x;
                    if (propertyGetterDescriptorImpl3 == null) {
                        PropertyDescriptorImpl.a(31);
                        throw r212;
                    }
                    propertyGetterDescriptorImpl.setInitialSignatureDescriptor(propertyGetterDescriptorImpl3.getInitialSignatureDescriptor() != null ? propertyGetterDescriptorImpl3.getInitialSignatureDescriptor().substitute(typeSubstitutorSubstituteTypeParameters) : r212);
                    propertyGetterDescriptorImpl.initialize(returnType != null ? typeSubstitutorSubstituteTypeParameters.substitute(returnType, Variance.OUT_VARIANCE) : r212);
                }
                PropertySetterDescriptor propertySetterDescriptor = propertyDescriptorImpl.f186653y;
                if (propertySetterDescriptor == null) {
                    propertySetterDescriptorImpl = r212;
                } else {
                    Annotations annotations2 = propertySetterDescriptor.getAnnotations();
                    Modality modality3 = this.f186655b;
                    DescriptorVisibility visibility2 = propertyDescriptorImpl.f186653y.getVisibility();
                    if (this.e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility2.normalize())) {
                        visibility2 = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    DescriptorVisibility descriptorVisibility3 = visibility2;
                    boolean zIsDefault2 = propertyDescriptorImpl.f186653y.isDefault();
                    boolean zIsExternal2 = propertyDescriptorImpl.f186653y.isExternal();
                    boolean zIsInline2 = propertyDescriptorImpl.f186653y.isInline();
                    CallableMemberDescriptor.Kind kind3 = this.e;
                    PropertyDescriptor propertyDescriptor3 = this.d;
                    propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(B, annotations2, modality3, descriptorVisibility3, zIsDefault2, zIsExternal2, zIsInline2, kind3, propertyDescriptor3 == null ? r212 : propertyDescriptor3.getSetter(), SourceElement.NO_SOURCE);
                }
                if (propertySetterDescriptorImpl != 0) {
                    typeSubstitutor = typeSubstitutorSubstituteTypeParameters;
                    List<ValueParameterDescriptor> substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptorImpl, propertyDescriptorImpl.f186653y.getValueParameters(), typeSubstitutor, false, false, null);
                    if (substitutedValueParameters == null) {
                        B.setSetterProjectedOut(true);
                        substitutedValueParameters = Collections.singletonList(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, DescriptorUtilsKt.getBuiltIns(this.f186654a).getNothingType(), propertyDescriptorImpl.f186653y.getValueParameters().get(0).getAnnotations()));
                    }
                    if (substitutedValueParameters.size() != 1) {
                        throw new IllegalStateException();
                    }
                    PropertySetterDescriptor propertySetterDescriptor2 = propertyDescriptorImpl.f186653y;
                    if (propertySetterDescriptor2 == null) {
                        PropertyDescriptorImpl.a(31);
                        throw r212;
                    }
                    propertySetterDescriptorImpl.setInitialSignatureDescriptor(propertySetterDescriptor2.getInitialSignatureDescriptor() != null ? propertySetterDescriptor2.getInitialSignatureDescriptor().substitute(typeSubstitutor) : r212);
                    propertySetterDescriptorImpl.initialize(substitutedValueParameters.get(0));
                } else {
                    typeSubstitutor = typeSubstitutorSubstituteTypeParameters;
                }
                FieldDescriptor fieldDescriptor = propertyDescriptorImpl.A;
                ?? fieldDescriptorImpl = fieldDescriptor == null ? r212 : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), B);
                FieldDescriptor fieldDescriptor2 = propertyDescriptorImpl.B;
                B.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? r212 : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), B));
                if (this.f186657g) {
                    SmartSet smartSetCreate = SmartSet.create();
                    Iterator<? extends PropertyDescriptor> it8 = propertyDescriptorImpl.getOverriddenDescriptors().iterator();
                    while (it8.hasNext()) {
                        smartSetCreate.add(it8.next().substitute(typeSubstitutor));
                    }
                    B.setOverriddenDescriptors(smartSetCreate);
                }
                if (propertyDescriptorImpl.isConst() && (function0 = propertyDescriptorImpl.f186675h) != null) {
                    B.setCompileTimeInitializer(propertyDescriptorImpl.f186674g, function0);
                }
                return B;
            }
            return null;
        }

        @NotNull
        public CopyConfiguration setCopyOverrides(boolean z) {
            this.f186657g = z;
            return this;
        }

        @NotNull
        public CopyConfiguration setKind(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.e = kind;
                return this;
            }
            a(10);
            throw null;
        }

        @NotNull
        public CopyConfiguration setModality(@NotNull Modality modality) {
            if (modality != null) {
                this.f186655b = modality;
                return this;
            }
            a(6);
            throw null;
        }

        @NotNull
        public CopyConfiguration setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
            this.d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        @NotNull
        public CopyConfiguration setOwner(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.f186654a = declarationDescriptor;
                return this;
            }
            a(0);
            throw null;
        }

        @NotNull
        public CopyConfiguration setSubstitution(@NotNull TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.f = typeSubstitution;
                return this;
            }
            a(15);
            throw null;
        }

        @NotNull
        public CopyConfiguration setVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.f186656c = descriptorVisibility;
                return this;
            }
            a(8);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        super(declarationDescriptor, annotations, name, null, z, sourceElement);
        if (declarationDescriptor == null) {
            a(0);
            throw null;
        }
        if (annotations == null) {
            a(1);
            throw null;
        }
        if (modality == null) {
            a(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(3);
            throw null;
        }
        if (name == null) {
            a(4);
            throw null;
        }
        if (kind == null) {
            a(5);
            throw null;
        }
        if (sourceElement == null) {
            a(6);
            throw null;
        }
        this.k = null;
        this.f186650t = Collections.EMPTY_LIST;
        this.i = modality;
        this.f186642j = descriptorVisibility;
        this.f186643l = propertyDescriptor == null ? this : propertyDescriptor;
        this.f186644m = kind;
        this.f186645n = z3;
        this.o = z4;
        this.f186646p = z6;
        this.f186647q = z11;
        this.f186648r = z12;
        this.f186649s = z29;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.a(int):void");
    }

    @NotNull
    public static PropertyDescriptorImpl create(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        if (annotations == null) {
            a(8);
            throw null;
        }
        if (modality == null) {
            a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(10);
            throw null;
        }
        if (name == null) {
            a(11);
            throw null;
        }
        if (kind == null) {
            a(12);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z, name, kind, sourceElement, z3, z4, z6, z11, z12, z29);
        }
        a(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertyDescriptor(this, d);
    }

    public PropertyDescriptorImpl b(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            a(32);
            throw null;
        }
        if (modality == null) {
            a(33);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(34);
            throw null;
        }
        if (kind == null) {
            a(35);
            throw null;
        }
        if (name != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name, kind, sourceElement, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
        }
        a(36);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    public List<PropertyAccessorDescriptor> getAccessors() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f186652x;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f186653y;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getBackingField() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.f186650t;
        if (list != null) {
            return list;
        }
        a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getDelegateField() {
        return this.B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f186644m;
        if (kind != null) {
            return kind;
        }
        a(39);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = this.i;
        if (modality != null) {
            return modality;
        }
        a(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        Collection<? extends PropertyDescriptor> collection = this.k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        a(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type != null) {
            return type;
        }
        a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertySetterDescriptor getSetter() {
        return this.f186653y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        ArrayList arrayList = this.f186651w;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f186642j;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        a(25);
        throw null;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor) {
        initialize(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f186647q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.f186649s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f186646p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f186648r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.f186645n;
    }

    public boolean isSetterProjectedOut() {
        return this.z;
    }

    @NotNull
    public CopyConfiguration newCopyBuilder() {
        return new CopyConfiguration();
    }

    public void setInType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return;
        }
        a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            this.k = collection;
        } else {
            a(40);
            throw null;
        }
    }

    public void setSetterProjectedOut(boolean z) {
        this.z = z;
    }

    public void setType(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeParameterDescriptor> list, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            a(17);
            throw null;
        }
        if (list == null) {
            a(18);
            throw null;
        }
        if (list2 == null) {
            a(19);
            throw null;
        }
        setOutType(kotlinType);
        this.f186651w = new ArrayList(list);
        this.v = receiverParameterDescriptor2;
        this.u = receiverParameterDescriptor;
        this.f186650t = list2;
    }

    public void setVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.f186642j = descriptorVisibility;
        } else {
            a(20);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public PropertyDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        PropertyDescriptor propertyDescriptorBuild = newCopyBuilder().setOwner(declarationDescriptor).setOriginal(null).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z).build();
        if (propertyDescriptorBuild != null) {
            return propertyDescriptorBuild;
        }
        a(42);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertyGetterDescriptorImpl getGetter() {
        return this.f186652x;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2) {
        this.f186652x = propertyGetterDescriptorImpl;
        this.f186653y = propertySetterDescriptor;
        this.A = fieldDescriptor;
        this.B = fieldDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : newCopyBuilder().setSubstitution(typeSubstitutor.getSubstitution()).setOriginal(getOriginal()).build();
        }
        a(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public PropertyDescriptor getOriginal() {
        PropertyDescriptor propertyDescriptor = this.f186643l;
        PropertyDescriptor original = propertyDescriptor == this ? this : propertyDescriptor.getOriginal();
        if (original != null) {
            return original;
        }
        a(38);
        throw null;
    }
}
