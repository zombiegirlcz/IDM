package com.github.devnied.emvnfccard.model.enums;

/* JADX INFO: loaded from: classes16.dex */
public enum ServiceCode1Enum implements IKeyEnum {
    INTERNATIONNAL(1, "International interchange", "None"),
    INTERNATIONNAL_ICC(2, "International interchange", "Integrated circuit card"),
    NATIONAL(5, "National interchange", "None"),
    NATIONAL_ICC(6, "National interchange", "Integrated circuit card"),
    PRIVATE(7, "Private", "None");

    private final String interchange;
    private final String technology;
    private final int value;

    ServiceCode1Enum(int i, String str, String str2) {
        this.value = i;
        this.interchange = str;
        this.technology = str2;
    }

    public String getInterchange() {
        return this.interchange;
    }

    @Override // com.github.devnied.emvnfccard.model.enums.IKeyEnum
    public int getKey() {
        return this.value;
    }

    public String getTechnology() {
        return this.technology;
    }
}
