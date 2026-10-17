package ch.qos.logback.core.joran.util;

import a0.d;
import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class PropertySetter extends ContextAwareBase {
    protected MethodDescriptor[] methodDescriptors;

    /* JADX INFO: renamed from: obj, reason: collision with root package name */
    protected Object f24069obj;
    protected Class<?> objClass;
    protected PropertyDescriptor[] propertyDescriptors;

    /* JADX INFO: renamed from: ch.qos.logback.core.joran.util.PropertySetter$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$util$AggregationType;

        static {
            int[] iArr = new int[AggregationType.values().length];
            $SwitchMap$ch$qos$logback$core$util$AggregationType = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PropertySetter(Object obj2) {
        this.f24069obj = obj2;
        this.objClass = obj2.getClass();
    }

    private String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    private AggregationType computeRawAggregationType(Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        return parameterClassForMethod == null ? AggregationType.NOT_FOUND : StringToObjectConverter.canBeBuiltFromSimpleString(parameterClassForMethod) ? AggregationType.AS_BASIC_PROPERTY : AggregationType.AS_COMPLEX_PROPERTY;
    }

    private Method findAdderMethod(String str) {
        return getMethod("add" + capitalizeFirstLetter(str));
    }

    private Method findSetterMethod(String str) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor != null) {
            return propertyDescriptor.getWriteMethod();
        }
        return null;
    }

    private Class<?> getParameterClassForMethod(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    private boolean isSanityCheckSuccessful(String str, Method method, Class<?>[] clsArr, Object obj2) {
        StringBuilder sb6;
        String name;
        Class<?> cls = obj2.getClass();
        if (clsArr.length != 1) {
            sb6 = a.x("Wrong number of parameters in setter method for property [", str, "] in ");
            name = this.f24069obj.getClass().getName();
        } else {
            if (clsArr[0].isAssignableFrom(obj2.getClass())) {
                return true;
            }
            StringBuilder sb9 = new StringBuilder("A \"");
            d.A(cls, sb9, "\" object is not assignable to a \"");
            sb9.append(clsArr[0].getName());
            sb9.append("\" variable.");
            addError(sb9.toString());
            addError("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            addError("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            sb6 = new StringBuilder("\"");
            sb6.append(cls.getName());
            sb6.append("\" was loaded by [");
            sb6.append(cls.getClassLoader());
            name = "].";
        }
        sb6.append(name);
        addError(sb6.toString());
        return false;
    }

    private boolean isUnequivocallyInstantiable(Class<?> cls) {
        if (cls.isInterface()) {
            return false;
        }
        return cls.getDeclaredConstructor(null).newInstance(null) != null;
    }

    public void addBasicProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String strCapitalizeFirstLetter = capitalizeFirstLetter(str);
        Method methodFindAdderMethod = findAdderMethod(strCapitalizeFirstLetter);
        if (methodFindAdderMethod == null) {
            addError("No adder for property [" + strCapitalizeFirstLetter + "].");
            return;
        }
        Class<?>[] parameterTypes = methodFindAdderMethod.getParameterTypes();
        isSanityCheckSuccessful(strCapitalizeFirstLetter, methodFindAdderMethod, parameterTypes, str2);
        try {
            if (StringToObjectConverter.convertArg(this, str2, parameterTypes[0]) != null) {
                invokeMethodWithSingleParameterOnThisObject(methodFindAdderMethod, str2);
            }
        } catch (Throwable th10) {
            addError("Conversion to type [" + parameterTypes[0] + "] failed. ", th10);
        }
    }

    public void addComplexProperty(String str, Object obj2) {
        Method methodFindAdderMethod = findAdderMethod(str);
        if (methodFindAdderMethod != null) {
            if (isSanityCheckSuccessful(str, methodFindAdderMethod, methodFindAdderMethod.getParameterTypes(), obj2)) {
                invokeMethodWithSingleParameterOnThisObject(methodFindAdderMethod, obj2);
            }
        } else {
            StringBuilder sbX = a.x("Could not find method [add", str, "] in class [");
            sbX.append(this.objClass.getName());
            sbX.append("].");
            addError(sbX.toString());
        }
    }

    public AggregationType computeAggregationType(String str) {
        Method methodFindAdderMethod = findAdderMethod(str);
        if (methodFindAdderMethod != null) {
            AggregationType aggregationTypeComputeRawAggregationType = computeRawAggregationType(methodFindAdderMethod);
            int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$util$AggregationType[aggregationTypeComputeRawAggregationType.ordinal()];
            if (i == 1) {
                return AggregationType.NOT_FOUND;
            }
            if (i == 2) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (i == 3) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (i == 4 || i == 5) {
                addError("Unexpected AggregationType " + aggregationTypeComputeRawAggregationType);
            }
        }
        Method methodFindSetterMethod = findSetterMethod(str);
        return methodFindSetterMethod != null ? computeRawAggregationType(methodFindSetterMethod) : AggregationType.NOT_FOUND;
    }

    public <T extends Annotation> T getAnnotation(String str, Class<T> cls, Method method) {
        if (method != null) {
            return (T) method.getAnnotation(cls);
        }
        return null;
    }

    public Class<?> getByConcreteType(String str, Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        if (parameterClassForMethod != null && isUnequivocallyInstantiable(parameterClassForMethod)) {
            return parameterClassForMethod;
        }
        return null;
    }

    public Class<?> getClassNameViaImplicitRules(String str, AggregationType aggregationType, DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        Class<?> clsFindDefaultComponentType = defaultNestedComponentRegistry.findDefaultComponentType(this.f24069obj.getClass(), str);
        if (clsFindDefaultComponentType != null) {
            return clsFindDefaultComponentType;
        }
        Method relevantMethod = getRelevantMethod(str, aggregationType);
        if (relevantMethod == null) {
            return null;
        }
        Class<?> defaultClassNameByAnnonation = getDefaultClassNameByAnnonation(str, relevantMethod);
        return defaultClassNameByAnnonation != null ? defaultClassNameByAnnonation : getByConcreteType(str, relevantMethod);
    }

    public Class<?> getDefaultClassNameByAnnonation(String str, Method method) {
        DefaultClass defaultClass = (DefaultClass) getAnnotation(str, DefaultClass.class, method);
        if (defaultClass != null) {
            return defaultClass.value();
        }
        return null;
    }

    public Method getMethod(String str) {
        if (this.methodDescriptors == null) {
            introspect();
        }
        int i = 0;
        while (true) {
            MethodDescriptor[] methodDescriptorArr = this.methodDescriptors;
            if (i >= methodDescriptorArr.length) {
                return null;
            }
            if (str.equals(methodDescriptorArr[i].getName())) {
                return this.methodDescriptors[i].getMethod();
            }
            i++;
        }
    }

    public Object getObj() {
        return this.f24069obj;
    }

    public Class<?> getObjClass() {
        return this.objClass;
    }

    public PropertyDescriptor getPropertyDescriptor(String str) {
        if (this.propertyDescriptors == null) {
            introspect();
        }
        int i = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.propertyDescriptors;
            if (i >= propertyDescriptorArr.length) {
                return null;
            }
            if (str.equals(propertyDescriptorArr[i].getName())) {
                return this.propertyDescriptors[i];
            }
            i++;
        }
    }

    public Method getRelevantMethod(String str, AggregationType aggregationType) {
        String strCapitalizeFirstLetter = capitalizeFirstLetter(str);
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            return findAdderMethod(strCapitalizeFirstLetter);
        }
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            return findSetterMethod(strCapitalizeFirstLetter);
        }
        throw new IllegalStateException(aggregationType + " not allowed here");
    }

    public void introspect() {
        try {
            this.propertyDescriptors = Introspector.getPropertyDescriptors(this.objClass);
            this.methodDescriptors = Introspector.getMethodDescriptors(this.objClass);
        } catch (IntrospectionException e) {
            addError("Failed to introspect " + this.f24069obj + ": " + e.getMessage());
            this.propertyDescriptors = new PropertyDescriptor[0];
            this.methodDescriptors = new MethodDescriptor[0];
        }
    }

    public void invokeMethodWithSingleParameterOnThisObject(Method method, Object obj2) {
        Class<?> cls = obj2.getClass();
        try {
            method.invoke(this.f24069obj, obj2);
        } catch (Exception e) {
            addError("Could not invoke method " + method.getName() + " in class " + this.f24069obj.getClass().getName() + " with parameter of type " + cls.getName(), e);
        }
    }

    public void setComplexProperty(String str, Object obj2) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor == null) {
            StringBuilder sbX = a.x("Could not find PropertyDescriptor for [", str, "] in ");
            sbX.append(this.objClass.getName());
            addWarn(sbX.toString());
            return;
        }
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            StringBuilder sbX2 = a.x("Not setter method for property [", str, "] in ");
            sbX2.append(this.f24069obj.getClass().getName());
            addWarn(sbX2.toString());
        } else if (isSanityCheckSuccessful(str, writeMethod, writeMethod.getParameterTypes(), obj2)) {
            try {
                invokeMethodWithSingleParameterOnThisObject(writeMethod, obj2);
            } catch (Exception e) {
                addError("Could not set component " + this.f24069obj + " for parent component " + this.f24069obj, e);
            }
        }
    }

    public void setProperty(PropertyDescriptor propertyDescriptor, String str, String str2) throws PropertySetterException {
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            throw new PropertySetterException(p.a.p("No setter for property [", str, "]."));
        }
        Class<?>[] parameterTypes = writeMethod.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw new PropertySetterException("#params for setter != 1");
        }
        try {
            Object objConvertArg = StringToObjectConverter.convertArg(this, str2, parameterTypes[0]);
            if (objConvertArg != null) {
                try {
                    writeMethod.invoke(this.f24069obj, objConvertArg);
                } catch (Exception e) {
                    throw new PropertySetterException(e);
                }
            } else {
                throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed.");
            }
        } catch (Throwable th10) {
            throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed. ", th10);
        }
    }

    public void setProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String strDecapitalize = Introspector.decapitalize(str);
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(strDecapitalize);
        if (propertyDescriptor == null) {
            StringBuilder sbX = a.x("No such property [", strDecapitalize, "] in ");
            sbX.append(this.objClass.getName());
            sbX.append(".");
            addWarn(sbX.toString());
            return;
        }
        try {
            setProperty(propertyDescriptor, strDecapitalize, str2);
        } catch (PropertySetterException e) {
            addWarn(j6.a.s("Failed to set property [", strDecapitalize, "] to value \"", str2, "\". "), e);
        }
    }
}
