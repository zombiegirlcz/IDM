package kotlin.reflect.jvm.internal.impl.util;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorNameConventions {

    @NotNull
    public static final Set<Name> ALL_BINARY_OPERATION_NAMES;

    @NotNull
    public static final Name AND;

    @NotNull
    public static final Set<Name> ASSIGNMENT_OPERATIONS;

    @NotNull
    public static final Set<Name> BINARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> BITWISE_OPERATION_NAMES;

    @NotNull
    public static final Name COMPARE_TO;

    @NotNull
    public static final Regex COMPONENT_REGEX;

    @NotNull
    public static final Name CONTAINS;

    @NotNull
    public static final Name DEC;

    @NotNull
    public static final Set<Name> DELEGATED_PROPERTY_OPERATORS;

    @NotNull
    public static final Name DIV;

    @NotNull
    public static final Name DIV_ASSIGN;

    @NotNull
    public static final Name EQUALS;

    @NotNull
    public static final Name GET;

    @NotNull
    public static final Name GET_VALUE;

    @NotNull
    public static final Name HASH_CODE;

    @NotNull
    public static final Name HAS_NEXT;

    @NotNull
    public static final Name INC;

    @NotNull
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    @NotNull
    public static final Name INV;

    @NotNull
    public static final Name INVOKE;

    @NotNull
    public static final Name ITERATOR;

    @NotNull
    public static final Name MINUS;

    @NotNull
    public static final Name MINUS_ASSIGN;

    @NotNull
    public static final Name NEXT;

    @NotNull
    public static final Name NOT;

    @NotNull
    public static final Set<Name> NUMBER_CONVERSIONS;

    @NotNull
    public static final Name OR;

    @NotNull
    public static final Name PLUS;

    @NotNull
    public static final Name PLUS_ASSIGN;

    @NotNull
    public static final Name PROVIDE_DELEGATE;

    @NotNull
    public static final Name RANGE_TO;

    @NotNull
    public static final Name RANGE_UNTIL;

    @NotNull
    public static final Name REM;

    @NotNull
    public static final Name REM_ASSIGN;

    @NotNull
    public static final Name SET;

    @NotNull
    public static final Name SET_VALUE;

    @NotNull
    public static final Name SHL;

    @NotNull
    public static final Name SHR;

    @NotNull
    public static final Set<Name> SIMPLE_BINARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> SIMPLE_BITWISE_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> STATEMENT_LIKE_OPERATORS;

    @NotNull
    public static final Name TIMES;

    @NotNull
    public static final Name TIMES_ASSIGN;

    @NotNull
    public static final Name TO_BYTE;

    @NotNull
    public static final Name TO_CHAR;

    @NotNull
    public static final Name TO_DOUBLE;

    @NotNull
    public static final Name TO_FLOAT;

    @NotNull
    public static final Name TO_INT;

    @NotNull
    public static final Name TO_LONG;

    @NotNull
    public static final Name TO_SHORT;

    @NotNull
    public static final Name TO_STRING;

    @NotNull
    public static final Name UNARY_MINUS;

    @NotNull
    public static final Set<Name> UNARY_OPERATION_NAMES;

    @NotNull
    public static final Name UNARY_PLUS;

    @NotNull
    public static final Name USHR;

    @NotNull
    public static final Name XOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f187868a;

    static {
        Name nameIdentifier = Name.identifier("getValue");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        GET_VALUE = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("setValue");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        SET_VALUE = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        PROVIDE_DELEGATE = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("equals");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        EQUALS = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        HASH_CODE = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("compareTo");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        COMPARE_TO = nameIdentifier6;
        Name nameIdentifier7 = Name.identifier("contains");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        CONTAINS = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("invoke");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        INVOKE = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("iterator");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        ITERATOR = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("get");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        GET = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("set");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        SET = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("next");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        NEXT = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("hasNext");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        HAS_NEXT = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("toString");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        TO_STRING = nameIdentifier14;
        COMPONENT_REGEX = new Regex("component\\d+");
        Name nameIdentifier15 = Name.identifier("and");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier15, "identifier(...)");
        AND = nameIdentifier15;
        Name nameIdentifier16 = Name.identifier("or");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier16, "identifier(...)");
        OR = nameIdentifier16;
        Name nameIdentifier17 = Name.identifier("xor");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier17, "identifier(...)");
        XOR = nameIdentifier17;
        Name nameIdentifier18 = Name.identifier("inv");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier18, "identifier(...)");
        INV = nameIdentifier18;
        Name nameIdentifier19 = Name.identifier("shl");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier19, "identifier(...)");
        SHL = nameIdentifier19;
        Name nameIdentifier20 = Name.identifier("shr");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier20, "identifier(...)");
        SHR = nameIdentifier20;
        Name nameIdentifier21 = Name.identifier("ushr");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier21, "identifier(...)");
        USHR = nameIdentifier21;
        Name nameIdentifier22 = Name.identifier("inc");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier22, "identifier(...)");
        INC = nameIdentifier22;
        Name nameIdentifier23 = Name.identifier("dec");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier23, "identifier(...)");
        DEC = nameIdentifier23;
        Name nameIdentifier24 = Name.identifier("plus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier24, "identifier(...)");
        PLUS = nameIdentifier24;
        Name nameIdentifier25 = Name.identifier("minus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier25, "identifier(...)");
        MINUS = nameIdentifier25;
        Name nameIdentifier26 = Name.identifier("not");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier26, "identifier(...)");
        NOT = nameIdentifier26;
        Name nameIdentifier27 = Name.identifier("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier27, "identifier(...)");
        UNARY_MINUS = nameIdentifier27;
        Name nameIdentifier28 = Name.identifier("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier28, "identifier(...)");
        UNARY_PLUS = nameIdentifier28;
        Name nameIdentifier29 = Name.identifier("times");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier29, "identifier(...)");
        TIMES = nameIdentifier29;
        Name nameIdentifier30 = Name.identifier("div");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier30, "identifier(...)");
        DIV = nameIdentifier30;
        Name nameIdentifier31 = Name.identifier("rem");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier31, "identifier(...)");
        REM = nameIdentifier31;
        Name nameIdentifier32 = Name.identifier("rangeTo");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier32, "identifier(...)");
        RANGE_TO = nameIdentifier32;
        Name nameIdentifier33 = Name.identifier("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier33, "identifier(...)");
        RANGE_UNTIL = nameIdentifier33;
        Name nameIdentifier34 = Name.identifier("timesAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier34, "identifier(...)");
        TIMES_ASSIGN = nameIdentifier34;
        Name nameIdentifier35 = Name.identifier("divAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier35, "identifier(...)");
        DIV_ASSIGN = nameIdentifier35;
        Name nameIdentifier36 = Name.identifier("remAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier36, "identifier(...)");
        REM_ASSIGN = nameIdentifier36;
        Name nameIdentifier37 = Name.identifier("plusAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier37, "identifier(...)");
        PLUS_ASSIGN = nameIdentifier37;
        Name nameIdentifier38 = Name.identifier("minusAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier38, "identifier(...)");
        MINUS_ASSIGN = nameIdentifier38;
        Name nameIdentifier39 = Name.identifier("toDouble");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier39, "identifier(...)");
        TO_DOUBLE = nameIdentifier39;
        Name nameIdentifier40 = Name.identifier("toFloat");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier40, "identifier(...)");
        TO_FLOAT = nameIdentifier40;
        Name nameIdentifier41 = Name.identifier("toLong");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier41, "identifier(...)");
        TO_LONG = nameIdentifier41;
        Name nameIdentifier42 = Name.identifier("toInt");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier42, "identifier(...)");
        TO_INT = nameIdentifier42;
        Name nameIdentifier43 = Name.identifier("toChar");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier43, "identifier(...)");
        TO_CHAR = nameIdentifier43;
        Name nameIdentifier44 = Name.identifier("toShort");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier44, "identifier(...)");
        TO_SHORT = nameIdentifier44;
        Name nameIdentifier45 = Name.identifier("toByte");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier45, "identifier(...)");
        TO_BYTE = nameIdentifier45;
        Name[] elements = {nameIdentifier22, nameIdentifier23, nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18};
        Intrinsics.checkNotNullParameter(elements, "elements");
        UNARY_OPERATION_NAMES = d.y0(elements);
        Name[] elements2 = {nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        SIMPLE_UNARY_OPERATION_NAMES = d.y0(elements2);
        Name[] elements3 = {nameIdentifier29, nameIdentifier24, nameIdentifier25, nameIdentifier30, nameIdentifier31, nameIdentifier32, nameIdentifier33};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set<Name> setY0 = d.y0(elements3);
        BINARY_OPERATION_NAMES = setY0;
        Name[] elements4 = {nameIdentifier29, nameIdentifier24, nameIdentifier25, nameIdentifier30, nameIdentifier31};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        SIMPLE_BINARY_OPERATION_NAMES = d.y0(elements4);
        Name[] elements5 = {nameIdentifier15, nameIdentifier16, nameIdentifier17, nameIdentifier18, nameIdentifier19, nameIdentifier20, nameIdentifier21};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set<Name> setY02 = d.y0(elements5);
        BITWISE_OPERATION_NAMES = setY02;
        Name[] elements6 = {nameIdentifier15, nameIdentifier16, nameIdentifier17, nameIdentifier19, nameIdentifier20, nameIdentifier21};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        SIMPLE_BITWISE_OPERATION_NAMES = d.y0(elements6);
        LinkedHashSet linkedHashSetL = a1.l(setY0, setY02);
        Name[] elements7 = {nameIdentifier4, nameIdentifier7, nameIdentifier6};
        Intrinsics.checkNotNullParameter(elements7, "elements");
        ALL_BINARY_OPERATION_NAMES = a1.l(linkedHashSetL, d.y0(elements7));
        Name[] elements8 = {nameIdentifier34, nameIdentifier35, nameIdentifier36, nameIdentifier37, nameIdentifier38};
        Intrinsics.checkNotNullParameter(elements8, "elements");
        Set<Name> setY03 = d.y0(elements8);
        ASSIGNMENT_OPERATIONS = setY03;
        Name[] elements9 = {nameIdentifier, nameIdentifier2, nameIdentifier3};
        Intrinsics.checkNotNullParameter(elements9, "elements");
        DELEGATED_PROPERTY_OPERATORS = d.y0(elements9);
        STATEMENT_LIKE_OPERATORS = a1.l(y0.b(nameIdentifier11), setY03);
        Name[] elements10 = {nameIdentifier39, nameIdentifier40, nameIdentifier41, nameIdentifier42, nameIdentifier44, nameIdentifier45, nameIdentifier43};
        Intrinsics.checkNotNullParameter(elements10, "elements");
        NUMBER_CONVERSIONS = d.y0(elements10);
        f187868a = r0.k(new Pair(nameIdentifier22, "++"), new Pair(nameIdentifier23, "--"), new Pair(nameIdentifier28, "+"), new Pair(nameIdentifier27, "-"), new Pair(nameIdentifier26, "!"), new Pair(nameIdentifier29, "*"), new Pair(nameIdentifier24, "+"), new Pair(nameIdentifier25, "-"), new Pair(nameIdentifier30, "/"), new Pair(nameIdentifier31, "%"), new Pair(nameIdentifier32, ".."), new Pair(nameIdentifier33, "..<"));
    }
}
