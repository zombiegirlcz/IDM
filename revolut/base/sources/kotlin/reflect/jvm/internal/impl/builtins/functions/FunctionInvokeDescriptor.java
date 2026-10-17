package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    @NotNull
    public static final Factory Factory = new Factory(null);

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final FunctionInvokeDescriptor create(@NotNull FunctionClassDescriptor functionClass, boolean z) {
            String lowerCase;
            Intrinsics.checkNotNullParameter(functionClass, "functionClass");
            List<TypeParameterDescriptor> declaredTypeParameters = functionClass.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z, null);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClass.getThisAsReceiverParameter();
            f0 f0Var = f0.f322471a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : declaredTypeParameters) {
                if (((TypeParameterDescriptor) obj2).getVariance() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj2);
            }
            q qVarK1 = d0.k1(arrayList);
            ArrayList arrayList2 = new ArrayList(w.t(qVarK1, 10));
            Iterator it8 = qVarK1.iterator();
            while (true) {
                d dVar = (d) it8;
                if (!((Iterator) dVar.f186416c).hasNext()) {
                    functionInvokeDescriptor.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, (List<ReceiverParameterDescriptor>) f0Var, (List<? extends TypeParameterDescriptor>) f0Var, (List<ValueParameterDescriptor>) arrayList2, (KotlinType) ((TypeParameterDescriptor) d0.m0(declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, DescriptorVisibilities.PUBLIC);
                    functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
                    return functionInvokeDescriptor;
                }
                IndexedValue indexedValue = (IndexedValue) dVar.next();
                Factory factory = FunctionInvokeDescriptor.Factory;
                int i = indexedValue.f186391a;
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) indexedValue.f186392b;
                factory.getClass();
                String strAsString = typeParameterDescriptor.getName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                if (Intrinsics.f(strAsString, "T")) {
                    lowerCase = "instance";
                } else if (Intrinsics.f(strAsString, "E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strAsString.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                FunctionInvokeDescriptor functionInvokeDescriptor2 = functionInvokeDescriptor;
                Annotations empty = Annotations.Companion.getEMPTY();
                Name nameIdentifier = Name.identifier(lowerCase);
                Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
                SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                functionInvokeDescriptor = functionInvokeDescriptor2;
                arrayList2.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor2, null, i, empty, nameIdentifier, defaultType, false, false, false, null, NO_SOURCE));
            }
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl b(FunctionDescriptorImpl.CopyConfiguration configuration) {
        Name name;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.b(configuration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it8.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                List<ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                List<ValueParameterDescriptor> list2 = valueParameters2;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator<T> it9 = list2.iterator();
                while (it9.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it9.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
                }
                int size = functionInvokeDescriptor.getValueParameters().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List<ValueParameterDescriptor> valueParameters3 = functionInvokeDescriptor.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters3, "getValueParameters(...)");
                    ArrayList<Pair> arrayListL1 = d0.l1(arrayList, valueParameters3);
                    if (arrayListL1.isEmpty()) {
                        return functionInvokeDescriptor;
                    }
                    for (Pair pair : arrayListL1) {
                        if (!Intrinsics.f((Name) pair.f186385a, ((ValueParameterDescriptor) pair.f186386b).getName())) {
                        }
                    }
                    return functionInvokeDescriptor;
                }
                List<ValueParameterDescriptor> valueParameters4 = functionInvokeDescriptor.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters4, "getValueParameters(...)");
                List<ValueParameterDescriptor> list3 = valueParameters4;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                    Name name2 = valueParameterDescriptor.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    int index = valueParameterDescriptor.getIndex();
                    int i = index - size;
                    if (i >= 0 && (name = (Name) arrayList.get(i)) != null) {
                        name2 = name;
                    }
                    arrayList2.add(valueParameterDescriptor.copy(functionInvokeDescriptor, name2, index));
                }
                FunctionDescriptorImpl.CopyConfiguration copyConfigurationC = functionInvokeDescriptor.c(TypeSubstitutor.EMPTY);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it10 = arrayList.iterator();
                    while (it10.hasNext()) {
                        if (((Name) it10.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                FunctionDescriptorImpl.CopyConfiguration original = copyConfigurationC.setHasSynthesizedParameterNames(z).setValueParameters((List<ValueParameterDescriptor>) arrayList2).setOriginal((CallableMemberDescriptor) functionInvokeDescriptor.getOriginal());
                Intrinsics.checkNotNullExpressionValue(original, "setOriginal(...)");
                FunctionDescriptorImpl functionDescriptorImplB = super.b(original);
                Intrinsics.h(functionDescriptorImplB);
                return functionDescriptorImplB;
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }
}
